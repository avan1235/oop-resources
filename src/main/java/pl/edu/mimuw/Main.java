package pl.edu.mimuw;

import java.util.function.Consumer;
import java.io.FileReader;
import java.io.BufferedReader;
import pl.edu.mimuw.resources.*;

public class Main {

  public static void main(String[] args) throws Exception{
    // task1();
    task2();

    FileReader fr = new FileReader(".");
    BufferedReader br = new BufferedReader(fr);
    try{
      System.out.println(br.readLine());
    } catch (NullPointerException e) {

    } finally {
      br.close();
      fr.close();
    }
  }

  private static void task2() throws Exception {
    // task21();
    // task22();
    // task23();
    // task24();
    // task25();
    task26();
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
      System.out.println("some unkown exception");
      System.out.println(e);
    } catch (ExceptionD e) {
      System.out.println("d");
      System.out.println(e);
    }
  }

  private static void task21() {
    StringUtils.printLength(null);
  }

  private static void task22() {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      System.out.println(e);
    }
  }

  private static void task23() {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      throw e;
    }
  }

  private static void task24() {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      e.fillInStackTrace();
      throw e;
    }
  }

  private static void task25() throws Exception{
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      e.fillInStackTrace();
      throw new Exception();
    }
  }

  private static void task26() throws Exception {
    try {
      StringUtils.printLength(null);
    } catch (NullPointerException e) {
      e.printStackTrace();
      e.fillInStackTrace();
      throw new Exception(e);
    }
  }

}
