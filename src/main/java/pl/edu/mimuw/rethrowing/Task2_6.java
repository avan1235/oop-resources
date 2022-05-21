package pl.edu.mimuw.rethrowing;

public final class Task2_6 {
  private Task2_6() { }

  /**
   * The program will crash and the JVM stack trace will be printed. It shows that Exception was thrown and that it was
   * caused by the NullPointerException from printLength() method.
   */
  public static void task2_6() throws Exception {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      throw new Exception(e);
    }
  }
}
