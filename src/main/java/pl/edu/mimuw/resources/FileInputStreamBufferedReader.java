package pl.edu.mimuw.resources;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.util.Scanner;

public class FileInputStreamBufferedReader implements Readable, Closeable {
  //to be honest I didn't know what to do
  //so it may be absolutely wrong
  //but I do not have any other idea right now

  private final String text;

  public FileInputStreamBufferedReader(File file) throws FileNotFoundException {
    String possibleText = null;
    try {
      Scanner myReader = new Scanner(file);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        if(possibleText == null)
          possibleText = "";
        possibleText += data;
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    this.text = possibleText;
  }

  public String readText() throws IOException {
    if(text == null)
    throw new IOException();
    return this.text;
  }

  @Override
  public void close() throws IOException {

  }

  @Override
  public int read(CharBuffer cb) throws IOException {
    return 0;
  }
}
