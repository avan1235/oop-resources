package pl.edu.mimuw;

import pl.edu.mimuw.resources.StringLength;

public class RethrowingExceptions2 {

  public static void main(String[] args) {
    try {
      StringLength.printLength(null);  // NullPointerException
    } catch (NullPointerException exception) {
      exception.printStackTrace();
    }
  }
}
