package pl.edu.mimuw.resources;

import java.io.*;
import java.nio.Buffer;
import java.nio.CharBuffer;

public class FileInputStreamBufferedReader implements Readable, Closeable {

  private final BufferedReader reader;

  public FileInputStreamBufferedReader(File file) throws FileNotFoundException {
    FileInputStream input = new FileInputStream(file);
    this.reader = new BufferedReader(new InputStreamReader(input));
  }

  public String readText() throws IOException {
    StringBuilder result = new StringBuilder();

    String line = this.reader.readLine();
    while (line != null) {
      result.append(line)
        .append("\n");
      line = this.reader.readLine();
    }

    return result.toString();
  }

  @Override
  public void close() throws IOException {
    this.reader.close();
  }

  @Override
  public int read(CharBuffer cb) throws IOException {
    return this.reader.read(cb);
  }
}
