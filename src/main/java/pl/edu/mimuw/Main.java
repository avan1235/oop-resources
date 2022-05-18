package pl.edu.mimuw;

import pl.edu.mimuw.resources.*;

public class Main {

  public static void main(String[] args) {
    try{
      RandomExceptionUtils.justThrow();
    } catch (ExceptionA | ExceptionB e) {
      System.out.println("a or b");
      System.out.println(e);
    } catch (ExceptionC e) {
      System.out.println("c");
      System.out.println(e);
    } catch (AbstractException e) {
      System.out.println("abstract");
      System.out.println(e);
    } catch (ExceptionD e) {
      System.out.println("d");
      System.out.println(e);
    }
  }
}
