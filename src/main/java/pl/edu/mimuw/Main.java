package pl.edu.mimuw;

import pl.edu.mimuw.resources.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
// import static pl.edu.mimuw.resources.Task26Exceptions.*;
public class Main {

  public static void main(String[] args) throws Exception{
    // task1();
    // task2();
    try(var filereader = new FileInputStreamBufferedReader(new File("tekst.txt"));){
      System.out.println(filereader.readText());
      filereader.close();
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }
  }

  private static void task2() throws Exception {
    // task21(); - Throws NullPointerException.
    // task22(); - Prints exactly the same stack as in task21, doesn't throw an exception.
    // task23(); - Thrown and printed stacks are the same.
    // task24(); - Thrown stack shows up only up to the place of rethrowing, printed is the same as in task22.
    // task25(); - Stacks are the same as in task24, but exception is of class Exception, not NullPointerException.
    // task26(); - Stacks are the same as in task25, but it also informs of cause being the NullPointerException 
    //             (with the stack same as the thrown Exception.)
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

}
