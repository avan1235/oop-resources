package pl.edu.mimuw.resources;

import java.io.*;
import java.nio.CharBuffer;

public class FileInputStreamBufferedReader implements Readable, Closeable {
  private File file;
  private FileInputStream stream;
  private InputStreamReader streamReader;
  private BufferedReader reader;

  public FileInputStreamBufferedReader(File file) throws FileNotFoundException {
    if (!file.exists()) throw new FileNotFoundException(file.toString());
    this.file = file;
    stream = new FileInputStream(file);
    streamReader = new InputStreamReader(stream);
    reader = new BufferedReader(streamReader);
  }

  public String readText() throws IOException {
    var s = new StringBuffer();
    reader.lines().forEach(line -> s.append(line).append("\n"));
    return s.toString();
  }

  @Override
  public void close() throws IOException {
    reader.close();
    streamReader.close();
    stream.close();
  }

  @Override
  public int read(CharBuffer charBuffer) throws IOException {
    return reader.read(charBuffer);
  }
}
