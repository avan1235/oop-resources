package pl.edu.mimuw.resources;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public class FileInputStreamBufferedReader implements Readable, Closeable {
    private FileInputStream fileStream;
    
    public FileInputStreamBufferedReader(File file) throws IOException {
        fileStream = new FileInputStream(file);
    } 
    

  
    public String readText() throws IOException {
      try(
        InputStreamReader reader = new InputStreamReader(fileStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
      ) {
          StringBuilder resultString = new StringBuilder();
          String line = "";
          while(line != null) {
            line = bufferedReader.readLine();
            if(line != null)
                resultString.append(line).append("\n");
          }
          return resultString.toString();
      }
    }



    @Override
    public void close() throws IOException {
        this.fileStream.close();
    }



    @Override
    public int read(CharBuffer charBuffer) throws IOException {
        charBuffer.append(this.readText());
        return charBuffer.length();
    }
  }