package pl.edu.mimuw.resources;

import java.io.*;
import java.nio.CharBuffer;

public class FileInputStreamBufferedReader implements Readable, Closeable {

  private final FileInputStream fileInputStream;
  public FileInputStreamBufferedReader(File file) throws FileNotFoundException {
    this.fileInputStream = new FileInputStream(file);
  }

  public String readText() throws IOException {
    try (
      InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
      BufferedReader reader = new BufferedReader(inputStreamReader)
      ) {
      var sb = new StringBuilder();
      String text;

      while ((text = reader.readLine()) != null) {
        sb.append(text).append("\n");
      }

      return sb.toString();
    }
  }

  @Override
  public void close() throws IOException {
    this.fileInputStream.close();
  }

  @Override
  public int read(CharBuffer charBuffer) throws IOException {
    String text = this.readText();
    charBuffer.append(text);
    return text.length();
  }
}
