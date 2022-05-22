package pl.edu.mimuw.resources;

public class Task24Exceptions {
    public static void task24() {
        try {
          StringUtils.printLength(null);
        } catch (NullPointerException e) {
          e.printStackTrace();
          e.fillInStackTrace();
          throw e;
        }
      }
}
