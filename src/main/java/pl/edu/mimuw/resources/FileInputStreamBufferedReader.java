package pl.edu.mimuw.resources;

import java.io.*;
import java.nio.CharBuffer;

public class FileInputStreamBufferedReader implements Readable, Closeable {

  private final FileInputStream input;

  public FileInputStreamBufferedReader(File file) throws FileNotFoundException {
    this.input=new FileInputStream(file);
  }

  public String readText() throws IOException {
    var sb=new StringBuilder();
    try (
      var i=new InputStreamReader(this.input);
      var b=new BufferedReader(i)
      ){
      for(String line=b.readLine();line!=null;line=b.readLine()){
        sb.append(line).append('\n');
      }
    }
    return sb.toString();
  }

  @Override
  public void close() throws IOException {
    this.input.close();
  }

  @Override
  public int read(CharBuffer cb) throws IOException {
    cb.append(this.readText());
    return this.readText().length();
  }
}
