package pl.edu.mimuw;

import pl.edu.mimuw.resources.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws ExceptionC {
    task3(new File("/home/kamart/IdeaProjects/oop-resources/src/main/java/pl/edu/mimuw/text"));
  }

  private static void task3(File file) {
    try (
      FileInputStreamBufferedReader reader = new FileInputStreamBufferedReader(file)
      )
    {
      System.out.println(reader.readText());
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found");
    } catch (IOException e) {
      System.out.println("IOException");
      e.printStackTrace();
    }
  }

  // Program ends at an exception and prints the stack trace.
  private static void task21() {
    StringUtils.printLength(null);
  }

  // Program prints the stack trace of the exception and continues operation
  private static void task22() {
    try {
      StringUtils.printLength(null);
    }
    catch (NullPointerException e) {
      e.printStackTrace();
    }
  }

  // Stack trace is printed and after the same stack trace is printed again.
  // The program stops execution.
  private static void task23() {
    try {
      StringUtils.printLength(null);
    }
    catch (NullPointerException e) {
      e.printStackTrace();
      throw e;
    }
  }

  // Stack trace is edited (no information about printLength method)
  private static void task24() {
    try {
      StringUtils.printLength(null);
    }
    catch (NullPointerException e) {
      e.printStackTrace();
      e.fillInStackTrace();
      throw e;
    }
  }

  // Only the stack trace for the thrown exception is shown.
  // The main method must declare the exception which can be thrown.
  // The program stops execution after throw.
  private static void task25() throws ExceptionC {
    try {
      StringUtils.printLength(null);
    }
    catch (NullPointerException e) {

      throw new ExceptionC("");
    }
  }

  // IDE show two exceptions thrown.
  private static void task26() {
    try {
      StringUtils.printLength(null);
    }
    catch (NullPointerException e) {
      throw new DoubleException(e);
    }
  }

  private static void task1() {
    try {
      RandomExceptionUtils.justThrow();
    }
    catch (ExceptionA | ExceptionB e) {
      System.out.println("a or b");
      System.out.println(e);
    }
    catch (ExceptionC e) {
      System.out.println("just c");
      System.out.println(e);
    }
    catch (AbstractException e) {
      System.out.println("some unknown exception type");
      System.out.println(e);
    }
    catch (ExceptionD e) {
      System.out.println("just d");
      System.out.println(e);
    }
  }
}


