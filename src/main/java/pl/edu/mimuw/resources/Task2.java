package pl.edu.mimuw.resources;

public class Task2 {
  public static void task21() {
    StringUtils.printFirstElem(null);//brak obsługi->wyjątek z problemem z kompilacją
  }

  public static void task22() {
    try {
      StringUtils.printFirstElem(null);
    } catch (NullPointerException e) {
      ExceptionA a=new ExceptionA("Null pointer");/*kompilacja pomyślna, z wyjątkiem (bez znaczenia czy wypisany wyjątek,
      który faktycznie miał miejsce czy instancja innej klasy wyjątku np. A */
      System.out.println(a);
    }
  }

  public static void task23() {
    try {
      StringUtils.printFirstElem(null);
    } catch (NullPointerException e) {
      e.printStackTrace();//wypisanie wywołanych metod od metody w ktorej wystapił wyjątek aż do początku stosu wywołań
      throw e;
    }
  }

  public static void task24() {
    try {
      StringUtils.printFirstElem(null);
    } catch (NullPointerException e) {
      e.fillInStackTrace();//wiecej detali z zastosowaniem fillInStackTrace()
      e.printStackTrace();
      throw e;
    }
  }

  public static void task25() throws Exception {
    try {
      StringUtils.printFirstElem(null);
    } catch (NullPointerException e) {
      e.fillInStackTrace();
      e.printStackTrace();
      throw new Exception();//nowy wyjątek bez inforormacji o typie
    }
  }

  public static void task26() throws Exception {
    try {
      StringUtils.printFirstElem(null);
    } catch (NullPointerException e) {
      e.fillInStackTrace();
      e.printStackTrace();
      throw new Exception(e);//tym razem przy testowaniu dodatkowa informacja o przyczynie wyjatku
    }
  }
}
