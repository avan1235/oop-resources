package pl.edu.mimuw.rethrowing;

public final class Task2_4 {
  private Task2_4() {
  }

  /**
   * The program will crash with NullPointerException. After using the method fillInStackTrace() on the exception,
   * the message shown by the JVM doesn't contain the information that the exception was originally thrown by
   * the printLength() method. It appears as if the exception was thrown in the task2_4() method.
   */
  public static void task2_4() {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      e.fillInStackTrace();
      throw e;
    }
  }
}
