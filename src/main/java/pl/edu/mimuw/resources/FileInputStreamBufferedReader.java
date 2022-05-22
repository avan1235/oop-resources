package pl.edu.mimuw.resources;

import java.io.*;
import java.nio.CharBuffer;

public class FileInputStreamBufferedReader implements Readable, Closeable {

  private final FileInputStream fileInputStream;

  public FileInputStreamBufferedReader(File file) throws FileNotFoundException {
    this.fileInputStream = new FileInputStream(file);
  }

  public String readText() throws IOException {
    StringBuilder sb = new StringBuilder();
    try (
      InputStreamReader isr = new InputStreamReader(this.fileInputStream);
      BufferedReader br = new BufferedReader(isr);
    ) {
      String line = br.readLine();
      while (line != null) {
        sb.append(line).append("\n");
        line = br.readLine();
      }
    }
    return sb.toString();
  }

  @Override
  public int read(CharBuffer cb) throws IOException {
    cb.append(this.readText());
    return this.readText().length();
  }

  @Override
  public void close() throws IOException {
    this.fileInputStream.close();
  }
}
