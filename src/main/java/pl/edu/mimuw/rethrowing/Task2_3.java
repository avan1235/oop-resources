package pl.edu.mimuw.rethrowing;

public final class Task2_3 {
  private Task2_3() { }

  /**
   * The program will crash with NullPointerException, the stack trace printed by us manually seems to be nearly the
   * same as the one printed by the JVM (JVM one also shows: 'Exception in thread "main"' at the start).
   */
  public static void task2_3() {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      throw e;
    }
  }
}
