package pl.edu.mimuw;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import pl.edu.mimuw.resources.*;

public class Main {
  public static void printLength(String s) {
    System.out.println(s.length());
  }
  public static void main(String[] args) throws ExceptionA {
    //Worked on absolute path, however I didn't manage to make it relative
    //task3(new File(Absolute path to text.txt));
    task3(new File("ThisPathDoesNotExist"));
  }

  private static void task1() {
    try {
      ThrowRandomException.throwException();
    }
    catch (ExceptionA | ExceptionB e) {
      System.out.println("A | B");
      System.out.println(e);
    }
    catch (ExceptionC e) {
      System.out.println("C");
      System.out.println(e);
    }
    catch (AbstractException e) {
      System.out.println("unknown");
      System.out.println(e);
    }
    catch (ExceptionD e) {
      System.out.println("D");
      System.out.println(e);
    }
  }

  //Throws nullPointerException
  public static void task2_1() {
      printLength(null);
  }

  //Prints exception but doesn't stop the program
  public static void task2_2() {
    try{
      printLength(null);
    }
    catch(NullPointerException e) {
      e.printStackTrace();
    }
  }

  //Firstly prints exception info, then throws it and stops the program
  public static void task2_3() {
    try{
      printLength(null);
    }
    catch(NullPointerException e) {
      e.printStackTrace();
      throw(e);
    }
  }
  //Printed ecxeption info, but without info about where it was thrown in printLength
  private static void task2_4() {
    try {
      printLength(null);
    }
    catch (NullPointerException e) {
      e.printStackTrace();
      e.fillInStackTrace();
      throw e;
    }
  }
  //Prints exception A (without info where caught exception occured in printLength because A was constructed later)
  private static void task2_5() throws ExceptionA {
    try {
      printLength(null);
    }
    catch (NullPointerException e) {
      throw new ExceptionA("test");
    }
  }

  private static void task3(File file) {
    try (
      FileInputStreamBufferedReader bufferedReader = new FileInputStreamBufferedReader(file);
    ) 
    {
      System.out.println(bufferedReader.readText());
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found exception");
      e.printStackTrace();
    } 
    catch (IOException e) {
      System.out.println("IO exception");
      e.printStackTrace();
    }
  }

}
