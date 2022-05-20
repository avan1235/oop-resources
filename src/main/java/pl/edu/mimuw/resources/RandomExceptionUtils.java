package pl.edu.mimuw.resources;

import java.util.Random;

public class RandomExceptionUtils {

  private static final Random RANDOM = new Random();

  public static void justThrow() throws AbstractException {
    switch (RANDOM.nextInt(4)) {
      case 0: {
        throw new ExceptionA("A");
      }
      case 1: {
        throw new ExceptionB("B");
      }
      case 2: {
        throw new ExceptionC("C");
      }
      default: {
        throw new ExceptionD("D");
      }
    }
  }
}
