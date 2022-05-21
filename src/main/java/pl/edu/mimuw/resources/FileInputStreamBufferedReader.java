package pl.edu.mimuw.resources;

import java.io.*;
import java.nio.CharBuffer;

public class FileInputStreamBufferedReader implements Readable, Closeable {

  private final File file;
  private final InputStream inputStream;

  public FileInputStreamBufferedReader(File file) throws FileNotFoundException {
    if (!file.exists()) throw new FileNotFoundException("File " + file.getName() + " could not be found");
    this.file = file;
    this.inputStream = new FileInputStream(file);
  }

  public String readText() throws IOException {
    try (InputStreamReader fileReader = new InputStreamReader(inputStream);
         BufferedReader bufferedReader = new BufferedReader(fileReader)
    ) {
      System.out.println("Reading text from file " + file.getName());

      final var sb = new StringBuilder();
      String line;

      while ((line = bufferedReader.readLine()) != null) {
        sb.append(line).append("\n");
      }

      return sb.toString();
    }
  }

  public void close() throws IOException {
    System.out.println("Closing file input stream " + file.getName());
    inputStream.close();
  }

  public int read(CharBuffer charBuffer) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
      return bufferedReader.read(charBuffer);
    }
  }
}
