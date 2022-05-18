package pl.edu.mimuw;

import pl.edu.mimuw.resources.*;

import java.io.File;
import java.io.IOException;

public class TryWithResources {

  public static void main(String[] args) throws IOException {
    var file = new File("example.txt");
    try (var reader = new FileInputStreamBufferedReader(file)) {
      System.out.println(reader.readText());
    }
  }
}
