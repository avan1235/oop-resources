package pl.edu.mimuw.rethrowing;

public final class StringUtils {

  private StringUtils() {
  }

  public static void printLength(String s) {
    if (s == null) {
      throw new NullPointerException();
    }
    System.out.println(s.length());
  }
}
