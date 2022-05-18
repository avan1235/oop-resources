package pl.edu.mimuw;

import pl.edu.mimuw.resources.*;

public class ExceptionClasses {

  public static void main(String[] args) {
    try {
      RandomExceptions.throwRandomException();
    } catch (ExceptionA | ExceptionB exception) {
      System.out.println("A or B");
      System.out.println(exception);
    } catch (ExceptionC exception) {
      System.out.println("C");
      System.out.println(exception);
    } catch (AbstractException exception) {
      System.out.println("Unknown exception");
      System.out.println(exception);
    }
  }
}
