package pl.edu.mimuw;

import pl.edu.mimuw.resources.StringLength;

public class RethrowingExceptions4 {

  public static void main(String[] args) {
    try {
      StringLength.printLength(null);  // NullPointerException
    } catch (NullPointerException exception) {
      // The exception is now reported as originating from here.
      exception.fillInStackTrace();
      throw exception;
    }
  }
}
