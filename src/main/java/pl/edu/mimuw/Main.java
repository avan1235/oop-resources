package pl.edu.mimuw;

import pl.edu.mimuw.resources.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // Catching my A-D exceptions:
    //task1();

    //task21();
    //task22();
    //task23();
    //task24();

    // Call to a method below can throw checked Exception,
    // so main() must be able to do that as well or try-catch it, but
    // Exception is too inclusive, so the latter might not be a good idea.
    //task25();

    task26();
  }

  private static void task1() {
    /*
     * Catches my A-D exceptions.
     */
    try {
      RandomExceptionUtils.justThrow();
    } catch (ExceptionA | ExceptionB e) {
      System.out.println("Exception A or B: " + e.getMessage());
    } catch (ExceptionC e) {
      System.out.println("Just C: " + e.getMessage());
    } catch (AbstractException e) {
      System.out.println("Unknown exception: " + e.getMessage());
    } catch (ExceptionD e) {
      System.out.println("Just D: " + e.getMessage());
    }
  }

  private static void task21() {
    /*
     * When null is passed to my method, it will
     * throw NLP (so a runtime exception) in return.
     */
    StringUtils.printLength(null);
  }

  private static void task22() {
    /*
     * We can try-catch this exception and get its stacktrace.
     * Program execution would then continue.
     */
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      System.out.println(e);
    }
  }

  private static void task23() {
    /*
     * After rethrowing e, both printed and JVM stacktrace
     * are identical. It makes sense, since stacktrace of e
     * is not modified in any way after being caught.
     */
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      throw e;
    }
  }

  private static void task24() {
    /*
     * fillInStackTrace() overwrites e's stacktrace with
     * one originating from the line that method was called. As a result we lose
     * the originally generated stacktrace that points to the real cause.
     */
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.fillInStackTrace();
      throw e;
    }
  }

  private static void task25() throws Exception {
    /*
     * Exception is checked at compile time, so we must
     * specify that this method throws it.
     */
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      throw new Exception();
    }
  }

  private static void task26() throws Exception {
    /*
     * We throw a new Exception, but this time
     * it also contains cause and detail message of e.
     */
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      throw new Exception(e);
    }
  }

}
