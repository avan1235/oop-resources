package pl.edu.mimuw.resources;

import java.io.*;
import java.nio.CharBuffer;

public class FileInputStreamBufferedReader implements Readable, Closeable {

  private final File file;
  private final FileInputStream fileInputStream;

  public FileInputStreamBufferedReader(File file) throws FileNotFoundException {
    if (!file.exists()) throw new FileNotFoundException("File " + file.getName() + " not found");
    this.file = file;
    this.fileInputStream = new FileInputStream(file);
  }

  public String readText() throws IOException {
    StringBuilder sb = new StringBuilder();
    try (
      BufferedReader buff = new BufferedReader(new InputStreamReader(fileInputStream))
    ) {
      String s;
      while (null != (s = buff.readLine()))
        sb.append(s).append("\n");
    }
    return sb.toString();
  }

  @Override
  public void close() throws IOException {
    fileInputStream.close();
  }

  @Override
  public int read(CharBuffer charBuffer) throws IOException {
    try (BufferedReader buff = new BufferedReader(new InputStreamReader(fileInputStream))) {
      return buff.read();
    }
  }
}
