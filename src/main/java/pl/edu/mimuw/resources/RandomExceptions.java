package pl.edu.mimuw.resources;

import java.util.ArrayList;
import java.util.Random;

public class RandomExceptions {
  private RandomExceptions() {
  }

  private static Random random = new Random();

  public static void throwRandomException() throws AbstractException {
    switch (random.nextInt(4)) {
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
