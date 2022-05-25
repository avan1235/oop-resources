package pl.edu.mimuw.resources;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.util.Scanner;

public class FileInputStreamBufferedReader implements Readable, Closeable {
  //corrected

  private final BufferedReader reader;

  public FileInputStreamBufferedReader(File file) throws FileNotFoundException {
    FileInputStream fis = new FileInputStream(file);
    InputStreamReader isr = new InputStreamReader(fis);
    this.reader =  new BufferedReader(isr);
  }

  public String readText() throws IOException {
      StringBuilder sb = new StringBuilder();
      while(true){
        String line = reader.readLine();
        if(line == null)
          break;
        sb.append(line).append("\n");
      }
      return sb.toString();
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
