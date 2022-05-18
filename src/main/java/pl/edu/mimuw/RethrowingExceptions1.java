package pl.edu.mimuw;

import pl.edu.mimuw.resources.StringLength;

public class RethrowingExceptions1 {

  public static void main(String[] args) {
    StringLength.printLength(null);  // NullPointerException
  }
}
