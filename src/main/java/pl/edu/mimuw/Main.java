package pl.edu.mimuw;

import pl.edu.mimuw.exceptions.*;
import pl.edu.mimuw.resources.FileInputStreamBufferedReader;
import pl.edu.mimuw.rethrowing.*;

import java.io.File;

public class Main {
  private static final int TASK_NUMBER = 2; // will leave it on 2 as it's the only one that doesn't crash the program
  private static final File FILE = new File("README.md");

  public static void main(String[] args) throws Exception {
    task1();
    task2();
    task3();
  }

  private static void task1() {
    try {
      RandomThrower.justThrow();
    } catch (ExceptionA e) {
      System.out.println("Exception A");
    } catch (ExceptionB | ExceptionC e) {
      System.out.println("Exception B or C");
    } catch (AbstractException e) {
      System.out.println("Unknown exception");
    } catch (ExceptionD e) {
      System.out.println("Exception D");
    }
  }

  private static void task2() throws Exception {
    switch (TASK_NUMBER) {
      case 1:
        Task2_1.task2_1();
        break;
      case 2:
        Task2_2.task2_2();
        break;
      case 3:
        Task2_3.task2_3();
        break;
      case 4:
        Task2_4.task2_4();
        break;
      case 5:
        Task2_5.task2_5();
        break;
      case 6:
        Task2_6.task2_6();
        break;
    }
  }

  private static void task3() throws Exception {
    try (FileInputStreamBufferedReader reader = new FileInputStreamBufferedReader(FILE)) {
      System.out.println(reader.readText());
    }

    /*
     * Such code would crash the program with the FileNotFoundException:
     * try (FileInputStreamBufferedReader reader = new FileInputStreamBufferedReader(new File("READMEassadsad.md"))) {
     *   System.out.println(reader.readText());
     * }
     */
  }
}
