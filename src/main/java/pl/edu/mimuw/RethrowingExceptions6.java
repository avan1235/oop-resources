package pl.edu.mimuw;

import pl.edu.mimuw.resources.ExceptionB;
import pl.edu.mimuw.resources.StringLength;

public class RethrowingExceptions6 {

  public static void main(String[] args) throws ExceptionB {
    try {
      StringLength.printLength(null);  // NullPointerException
    } catch (NullPointerException exception) {
      throw new ExceptionB(exception);
    }
  }
}
