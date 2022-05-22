package pl.edu.mimuw;

import pl.edu.mimuw.resources.*;

import java.io.File;

public class Main {

  public static void main(String[] args) throws Exception {
    /*task21();
    Program fails and prints:

    Exception in thread "main" java.lang.NullPointerException
    at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:7)
    at pl.edu.mimuw.Main.task21(Main.java:37)
    at pl.edu.mimuw.Main.main(Main.java:10)
     */
    /*task22();
    Program runs correctly and prints:
    BUILD SUCCESSFUL in 462ms
    2 actionable tasks: 2 executed
    java.lang.NullPointerException
      at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:7)
      at pl.edu.mimuw.Main.task22(Main.java:45)
      at pl.edu.mimuw.Main.main(Main.java:15)
    13:04:36: Execution finished ':Main.main()'.
    */
    /*task23();
    Exception printed:
    java.lang.NullPointerException
      at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:7)
      at pl.edu.mimuw.Main.task23(Main.java:65)
      at pl.edu.mimuw.Main.main(Main.java:29)
    Exception thrown:
    Exception in thread "main" java.lang.NullPointerException
      at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:7)
      at pl.edu.mimuw.Main.task23(Main.java:65)
      at pl.edu.mimuw.Main.main(Main.java:29)
    It's the same exception but caught in a different place.
     */
    /*task24();
    Excepton printed in task24():
    java.lang.NullPointerException
        at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:7)
        at pl.edu.mimuw.Main.task24(Main.java:84)
        at pl.edu.mimuw.Main.main(Main.java:39)
     Exception thrown:
     Exception in thread "main" java.lang.NullPointerException
        at pl.edu.mimuw.Main.task24(Main.java:87)
        at pl.edu.mimuw.Main.main(Main.java:39)
     */
    /*task25();
    Exception printed in task25():
    java.lang.NullPointerException
      at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:7)
      at pl.edu.mimuw.Main.task25(Main.java:107)
      at pl.edu.mimuw.Main.main(Main.java:50)

    Exception thrown:
    Exception in thread "main" java.lang.Exception
      at pl.edu.mimuw.Main.task25(Main.java:111)
      at pl.edu.mimuw.Main.main(Main.java:50)
     */
    /*task26();
    Exception printed in task26():
    java.lang.NullPointerException
      at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:7)
      at pl.edu.mimuw.Main.task26(Main.java:129)
      at pl.edu.mimuw.Main.main(Main.java:62)


    Exception in thread "main" java.lang.Exception: java.lang.NullPointerException
      at pl.edu.mimuw.Main.task26(Main.java:133)
      at pl.edu.mimuw.Main.main(Main.java:62)
    Caused by: java.lang.NullPointerException
      at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:7)
      at pl.edu.mimuw.Main.task26(Main.java:129)
      ... 1 more
     */
    var temp = new FileInputStreamBufferedReader(new File("README.md"));
    System.out.print(temp.readText());
  }

  private static void task1() {
    try {
      RandomExceptionUtils.justThrow();
    } catch (ExceptionA | ExceptionB e) {
      System.out.println("a or b");
      System.out.println(e);
    } catch (ExceptionC e) {
      System.out.println("c");
      System.out.println(e);
    } catch (AbstractException e) {
      System.out.println("abstract");
      System.out.println(e);
    } catch (ExceptionD e) {
      System.out.println("d");
      System.out.println(e);
    }
  }

  private static void task21() throws Exception {
    StringUtils.printLength(null);
  }


  private static void task22() throws Exception {
    try {
      StringUtils.printLength(null);
    } catch (RuntimeException e) {
      e.printStackTrace();
    }
  }

  private static void task23() throws Exception {
    try {
      StringUtils.printLength(null);
    } catch (RuntimeException e) {
      e.printStackTrace();
      System.out.println("\n");
      throw e;
    }
  }

  private static void task24() throws Exception {
    try {
      StringUtils.printLength(null);
    } catch (RuntimeException e) {
      e.printStackTrace();
      System.out.println("\n");
      e.fillInStackTrace();
      throw e;
    }
  }

  private static void task25() throws Exception {
    try {
      StringUtils.printLength(null);
    } catch (RuntimeException e) {
      e.printStackTrace();
      System.out.println("\n");
      throw new Exception();
    }
  }

  private static void task26() throws Exception {
    try {
      StringUtils.printLength(null);
    } catch (RuntimeException e) {
      e.printStackTrace();
      System.out.println("\n");
      throw new Exception(e);
    }
  }
}


