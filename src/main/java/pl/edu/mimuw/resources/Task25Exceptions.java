package pl.edu.mimuw.resources;

public class Task25Exceptions {
    public static void task25() throws Exception{
        try {
          StringUtils.printLength(null);
        } catch (NullPointerException e) {
          e.printStackTrace();
          e.fillInStackTrace();
          throw new Exception();
        }
      }
}
