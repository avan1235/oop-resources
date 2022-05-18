package pl.edu.mimuw;

import pl.edu.mimuw.resources.ExceptionB;
import pl.edu.mimuw.resources.StringLength;

public class RethrowingExceptions5 {

  public static void main(String[] args) throws ExceptionB {
    try {
      StringLength.printLength(null);  // NullPointerException
    } catch (NullPointerException exception) {
      // ExceptionB must be added to main's signature.
      throw new ExceptionB("Actually a NullPointerException");
    }
  }
}
