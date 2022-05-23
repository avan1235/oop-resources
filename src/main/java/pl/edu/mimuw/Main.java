package pl.edu.mimuw;

import pl.edu.mimuw.resources.*;
import static pl.edu.mimuw.resources.Task2.*;

import java.io.*;

public class Main {

  private static void task0() {
    try {
      RandomExceptionUnit.justThrow();
    } catch (ExceptionA | ExceptionB | ExceptionC e) {
      System.out.println("AbstractException of type A,B or C");
      System.out.println(e);
    } catch (ExceptionD e) {
      System.out.println("RuntimeException of type D:");
      System.out.println(e);
    } catch (Exception e) {
      System.out.println("Unknown type of exception:");
      System.out.println(e);
    }
  }

  private static void task1() throws Exception {
    FileReader f = new FileReader("");
    BufferedReader b = new BufferedReader(f);
    try {
      System.out.println(b.readLine());
    } catch (FileNotFoundException | NullPointerException e) {/*rozpatrzenie możliwości w której wskaźnik jest pusty
    lub pliku nie ma: przy testowaniu wypisany FileNotFoundException */
    } finally {
      b.close();
      f.close();
    }
  }

  private static void task2() throws Exception {
    task21();
    task22();
    task23();
    task24();
    task25();
    task26();
  }

  private static void task3(File file){
    try(
      var b=new FileInputStreamBufferedReader(file);
      ){
      System.out.println(b.readText());
    }catch(FileNotFoundException e){
      System.out.println("File not found");
    }catch(IOException e){
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws Exception {
    //task0();
    //task1();
    //task2();

    task3(new File("sample.txt"));
    task3(new File(""));
  }
}
