package pl.edu.mimuw.resources;

import java.io.*;
import java.nio.CharBuffer;

public class FileInputStreamBufferedReader implements Readable, Closeable {
  private final BufferedReader reader;

  public FileInputStreamBufferedReader(File file) throws FileNotFoundException {
    this.reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
    // For reading streams of characters, consider using FileReader. -- Oracle
    // this.reader = new BufferedReader(new FileReader(file));
  }

  public String readText() throws IOException {
    StringBuilder res = new StringBuilder();
    reader.lines().forEach(line -> res.append(line).append("\n"));
    return res.toString();
  }

  @Override
  public void close() throws IOException {
    reader.close();
  }

  @Override
  public int read(CharBuffer cb) throws IOException {
    return reader.read(cb);
  }
}

