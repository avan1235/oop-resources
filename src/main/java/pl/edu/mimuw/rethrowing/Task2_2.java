package pl.edu.mimuw.rethrowing;

public final class Task2_2 {
  private Task2_2() { }

  /**
   * The program will not crash and will print the stack trace of the exception.
   */
  public static void task2_2() {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
    }
  }
}
