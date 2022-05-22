package pl.edu.mimuw.resources;

public class Task26Exceptions {
    public static void task26() throws Exception {
        try {
          StringUtils.printLength(null);
        } catch (NullPointerException e) {
          e.printStackTrace();
          e.fillInStackTrace();
          throw new Exception(e);
        }
      }
}
