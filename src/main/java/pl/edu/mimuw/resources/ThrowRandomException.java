package pl.edu.mimuw.resources;

import java.util.Random;

public class ThrowRandomException {
    public ThrowRandomException() {

    }
    public static void throwException() throws AbstractException{
        Random rand = new Random();
        int x = rand.nextInt(4);
        if(x == 0) throw new ExceptionA("Exception A");
        if(x == 1) throw new ExceptionB("Exception B");
        if(x == 2) throw new ExceptionC("Exception C");
        if(x == 3) throw new ExceptionD("Exception D");
    }
}
