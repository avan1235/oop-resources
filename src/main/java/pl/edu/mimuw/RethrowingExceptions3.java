package pl.edu.mimuw;

import pl.edu.mimuw.resources.StringLength;

public class RethrowingExceptions3 {

  public static void main(String[] args) {
    try {
      StringLength.printLength(null);  // NullPointerException
    } catch (NullPointerException exception) {
      // Near match, only "Exception in thread "main"" is missing from the first trace.
      exception.printStackTrace();
      throw exception;
    }
  }
}
