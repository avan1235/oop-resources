package pl.edu.mimuw.resources;

public class Task23Exceptions {
    public static void task23() {
        try {
          StringUtils.printLength(null);
        } catch (NullPointerException e) {
          e.printStackTrace();
          throw e;
        }
      }
}
