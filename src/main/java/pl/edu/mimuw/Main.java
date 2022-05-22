package pl.edu.mimuw;

import pl.edu.mimuw.resources.*;

import java.io.*;

public class Main {

  public static void main(String[] args) throws Exception {
    //task1();
    //task2();

    File test = new File("test.txt");
    File notExistingFile = new File(".");

    task3(test);
    task3(notExistingFile);
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
      System.out.println("just d");
      System.out.println(e);
    }
  }

  private static void task2() throws Exception {
    //task21();
    //task22();
    //task23();
    //task24();
    //task25();
    task26();
  }

  //Exception failed - program doesn't compile and prints stack trace
  private static void task21() {
    StringUtils.printLength(null);
  }

  //program compiles, catches the exception and prints stack trace
  private static void task22() {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
    }
  }

  //program catches the exception, prints stack trace twice, second one by throwing the exception further
  private static void task23() {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      throw e;
    }
  }

  //program prints stack trace twice, but second print is doesn't include information about using printLength method
  //which was declared in another class
  private static void task24() {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      e.fillInStackTrace();
      throw e;
    }
  }

  //program prints new exception's stack trace, we have to change the type of exception thrown by main
  private static void task25() throws Exception {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      throw new Exception();
    }
  }

  //program prints two different exceptions
  private static void task26() throws Exception {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      throw new Exception(e);
    }
  }

  private static void task3(File file) {
    try (FileInputStreamBufferedReader br = new FileInputStreamBufferedReader(file)) {
      System.out.println(br.readText());
    } catch (FileNotFoundException e) {
      System.out.println("file doesn't exist");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
