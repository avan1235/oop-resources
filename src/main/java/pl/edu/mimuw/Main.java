package pl.edu.mimuw;

import pl.edu.mimuw.resources.*;

import java.io.File;

public class Main {

  public static void main(String[] args) throws Exception {

    //try-wth-resource
    //good path
    var file = new File("text.txt");
    try (
      FileInputStreamBufferedReader br = new FileInputStreamBufferedReader(file)
    ) {
      System.out.println(br.readText());
    } catch (Exception e) {
      e.printStackTrace();
    }

    //wrong path
    var file2 = new File("energylandiaenergyladandiaswietnazabawaprzezcalydzien");
    try (
      FileInputStreamBufferedReader br = new FileInputStreamBufferedReader(file2)
    ) {
      System.out.println(br.readText());
    } catch (Exception e) {
      e.printStackTrace();
    }

    //task1();
    //task2_1();
    //task2_2();
    //task2_3();
    //task2_4();
    //task2_5();
    //task2_6();
  }

  private static void task1() {
    try {
      RandomExceptionUtils.justThrow();
    } catch (ExceptionA | ExceptionB e) {
      System.out.println("A or B");
      System.out.println(e);
    } catch (ExceptionC e) {
      System.out.println("C");
      System.out.println(e);
    } catch (AbstractException e) {
      System.out.println("Unknow");
      System.out.println(e);
    } catch (ExceptionD e) {
      System.out.println("D");
      System.out.println(e);
    }
  }

  // Program failed.
  // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
  //	at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:6)
  //	at pl.edu.mimuw.Main.task2_1(Main.java:36)
  //	at pl.edu.mimuw.Main.main(Main.java:9)
  private static void task2_1() {
    StringUtils.printLength(null);
  }

  // Prints same as in task2_1. But now without throwing exception.
  // java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
  //	at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:6)
  //	at pl.edu.mimuw.Main.task2_2(Main.java:46)
  //	at pl.edu.mimuw.Main.main(Main.java:10)
  private static void task2_2() {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
    }
  }

  // Program failed, but yes, they are identical.
  // java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
  //	at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:6)
  //	at pl.edu.mimuw.Main.task2_3(Main.java:59)
  //	at pl.edu.mimuw.Main.main(Main.java:11)
  // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
  //	at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:6)
  //	at pl.edu.mimuw.Main.task2_3(Main.java:59)
  //	at pl.edu.mimuw.Main.main(Main.java:11)
  private static void task2_3() {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      throw e;
    }
  }

  // Program failed. Print the same as in task2_2.
  // Now stacktraces are not identical.
  // java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
  //	at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:6)
  //	at pl.edu.mimuw.Main.task2_4(Main.java:79)
  //	at pl.edu.mimuw.Main.main(Main.java:12)
  // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
  //	at pl.edu.mimuw.Main.task2_4(Main.java:82)
  //	at pl.edu.mimuw.Main.main(Main.java:12)
  private static void task2_4() {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      e.fillInStackTrace();
      throw e;
    }
  }

  //Program failed.
  // java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
  //  at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:6)
  //  at pl.edu.mimuw.Main.task2_5(Main.java:72)
  //  at pl.edu.mimuw.Main.main(Main.java:13)
  // Exception in thread "main" java.lang.Exception
  //  at pl.edu.mimuw.Main.task2_5(Main.java:76)
  //  at pl.edu.mimuw.Main.main(Main.java:13)
  private static void task2_5() throws Exception {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      e.fillInStackTrace();
      throw new Exception();
    }
  }

  // Program failed.
  // Exception in thread "main" java.lang.Exception: java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
  //	at pl.edu.mimuw.Main.task2_6(Main.java:117)
  //	at pl.edu.mimuw.Main.main(Main.java:14)
  // Caused by: java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
  //	at pl.edu.mimuw.resources.StringUtils.printLength(StringUtils.java:6)
  //	at pl.edu.mimuw.Main.task2_6(Main.java:115)
  //	... 1 more
  private static void task2_6() throws Exception {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      throw new Exception(e);
    }
  }
}
