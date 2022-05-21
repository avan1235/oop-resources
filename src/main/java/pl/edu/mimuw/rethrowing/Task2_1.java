package pl.edu.mimuw.rethrowing;

public final class Task2_1 {
  private Task2_1() { }

  /**
   * The program will crash with NullPointerException.
   */
  public static void task2_1() {
    StringUtils.printLength(null);
  }
}
