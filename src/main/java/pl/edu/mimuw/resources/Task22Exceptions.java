package pl.edu.mimuw.resources;

public class Task22Exceptions {
    public static void task22() {
        try {
          StringUtils.printLength(null);
        } catch (NullPointerException e) {
          e.printStackTrace();
          System.out.println(e);
        }
      }
}
