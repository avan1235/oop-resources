package pl.edu.mimuw.resources;

import java.util.Random;

public class RandomExceptionUnit extends Exception{

  private static final Random RAND=new Random();
  public static void justThrow() throws AbstractException, ExceptionD, ExceptionA {
      switch (RAND.nextInt(4)){
        case 0:{
          throw new ExceptionA();
        }
        case 1:{
          throw new ExceptionB();
        }
        case 2:{
          throw new ExceptionC();
        }
        default:{
          throw new ExceptionD();
        }
      }
  }
}
