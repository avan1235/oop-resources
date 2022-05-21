package pl.edu.mimuw.exceptions;

import java.util.Random;

public final class RandomThrower {

  private static final Random RANDOM = new Random();

  private RandomThrower() {
  }

  public static void justThrow() throws AbstractException, ExceptionD {
    switch (RANDOM.nextInt(4)) {
      case 0:
        throw new ExceptionA("A");
      case 1:
        throw new ExceptionB("B");
      case 2:
        throw new ExceptionC("C");
      case 3:
        throw new ExceptionD("D");
    }
  }
}
