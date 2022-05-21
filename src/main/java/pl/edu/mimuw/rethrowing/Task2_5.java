package pl.edu.mimuw.rethrowing;

public final class Task2_5 {
  private Task2_5() {
  }

  /**
   * The program will crash and the JVM stack trace will be printed but this time it appears as if Exception was throw,
   * not NullPointerException as previously.
   */
  public static void task2_5() throws Exception {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      throw new Exception();
    }
  }
}
