package pl.edu.mimuw;

import pl.edu.mimuw.resources.*;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

  public static void main(String[] args) throws Exception {
    //task1();
    //task2();

    FileReader fr = new FileReader(".");
    BufferedReader br = new BufferedReader(fr);
    try {
      System.out.println(br.readLine());
    } catch (NullPointerException e) {
    } finally {
      br.close();
      fr.close();
    }

  }

  private static void task1() {
    try {
      RandomExceptionUtils.justThrow();
    } catch (ExceptionA | ExceptionB e) {
      System.out.println("a or b");
      System.out.println(e);
    } catch (ExceptionC e) {
      System.out.println("just c");
      System.out.println(e);
    } catch (AbstractException e) {
      System.out.println("some unknown exception type");
      System.out.println(e);
    } catch (ExceptionD e) {
      System.out.println("d");
      System.out.println(e);
    }
  }

  private static void task2() throws Exception {
    // task21();
    // task22();
    // task23();
    // task24();
    // task25();
    //task26();
  }

  private static void task21() {
    //task failed with lines:
    //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
    //	at pl.edu.mimuw.resources.StringUtils.printfLength(StringUtils.java:10)
    //	at pl.edu.mimuw.Main.task21(Main.java:54)
    //	at pl.edu.mimuw.Main.task2(Main.java:45)
    //	at pl.edu.mimuw.Main.main(Main.java:12)
    //normal information about failed task
    StringUtils.printfLength(null);
  }

  private static void task22() {
    //task successful with lines
    //java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
    //so it properly indicated the exception
    try {
      StringUtils.printfLength(null);
    } catch (NullPointerException e) {
      System.out.println(e);
    }
  }

  private static void task23() {
    //task failed with lines
    //java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
    //	at pl.edu.mimuw.resources.StringUtils.printfLength(StringUtils.java:10)
    //	at pl.edu.mimuw.Main.task23(Main.java:81)
    //	at pl.edu.mimuw.Main.task2(Main.java:47)
    //	at pl.edu.mimuw.Main.main(Main.java:12)
    //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
    //	at pl.edu.mimuw.resources.StringUtils.printfLength(StringUtils.java:10)
    //	at pl.edu.mimuw.Main.task23(Main.java:81)
    //	at pl.edu.mimuw.Main.task2(Main.java:47)
    //	at pl.edu.mimuw.Main.main(Main.java:12)
    //StackTrace is identical
    try {
      StringUtils.printfLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      throw e;
    }
  }

  private static void task24() {
    //task failed with lines
    //java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
    //	at pl.edu.mimuw.resources.StringUtils.printfLength(StringUtils.java:10)
    //	at pl.edu.mimuw.Main.task24(Main.java:101)
    //	at pl.edu.mimuw.Main.task2(Main.java:48)
    //	at pl.edu.mimuw.Main.main(Main.java:12)
    //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
    //	at pl.edu.mimuw.Main.task24(Main.java:104)
    //	at pl.edu.mimuw.Main.task2(Main.java:48)
    //	at pl.edu.mimuw.Main.main(Main.java:12)
    // Reported lines differ
    try {
      StringUtils.printfLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      e.fillInStackTrace();
      throw e;
    }
  }

  private static void task25() throws Exception {
    //task failed with lines
    //java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
    //	at pl.edu.mimuw.resources.StringUtils.printfLength(StringUtils.java:10)
    //	at pl.edu.mimuw.Main.task25(Main.java:121)
    //	at pl.edu.mimuw.Main.task2(Main.java:49)
    //	at pl.edu.mimuw.Main.main(Main.java:12)
    //Exception in thread "main" java.lang.Exception
    //	at pl.edu.mimuw.Main.task25(Main.java:125)
    //	at pl.edu.mimuw.Main.task2(Main.java:49)
    //	at pl.edu.mimuw.Main.main(Main.java:12)
    // As we thrown new Exception, we do not have the exact type of it
    try {
      StringUtils.printfLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      e.fillInStackTrace();
      throw new Exception();
    }
  }

  private static void task26() throws Exception {
    //task failed with lines:
    //java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
    //	at pl.edu.mimuw.resources.StringUtils.printfLength(StringUtils.java:10)
    //	at pl.edu.mimuw.Main.task26(Main.java:151)
    //	at pl.edu.mimuw.Main.task2(Main.java:50)
    //	at pl.edu.mimuw.Main.main(Main.java:12)
    //Exception in thread "main" java.lang.Exception: java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
    //	at pl.edu.mimuw.Main.task26(Main.java:155)
    //	at pl.edu.mimuw.Main.task2(Main.java:50)
    //	at pl.edu.mimuw.Main.main(Main.java:12)
    //Caused by: java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
    //
    //Caused by: java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
    //	at pl.edu.mimuw.Main.task26(Main.java:154)
    //	... 2 more
    //
    // prints much more information
    try {
      StringUtils.printfLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      e.fillInStackTrace();
      throw new Exception(e);
    }
  }


}
