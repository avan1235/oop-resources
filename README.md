# Exceptions and resources in Java

## Exception classes

Implement method, that will throw random of your created 4 exceptions. Your goals:
1. create own exceptions that are checked and unchecked (at least 1 unchecked)
2. catch needed exceptions (separately) and show how to catch a few in single `catch` block (**don't** use abstract
   class to catch your exception in this case)
3. make signature of your method to contain only **2** exception classes (remember about inheritance and the
   difference about checked/unchecked exceptions)

## Rethrowing exceptions

Implement every step in separate file (you can copy/past most of previous steps to next ones).

Implement single method that takes a String and prints its length.
Let's use it in `main` and write your observations about:
1. what happens when you pass `null` as an argument to your method - comment
2. what happens when you `try/catch` this exception - print its stacktrace in `catch`
3. try to rethrow caught exception after printing - is the printed stacktrace identical to the stacktrace reported
   by virtual machine? - comment
4. use `fillInStackTrace` method (reading its documentation from Oracle) before rethrowing this exception - comment
5. instead of rethrowing caught exception, throw another one of `Exception` class (take a look how the signature of
   `main` must change) - comment
6. try to add caught exception to the new one (using proper constructor that can take an exception) - comment

## Try with resources

Read [tutorial](https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html) and compare with
[this article](https://www.oracle.com/technical-resources/articles/java/trywithresources.html) - maybe bookmark them
and leave for future to compare how to would understand them after e.g. a year of working with Java.

Implement class
```java
public class FileInputStreamBufferedReader implements Readable, Closeable {

  public FileInputStreamBufferedReader(File file) throws FileNotFoundException {

  }

  public String readText() throws IOException {
    throw new IllegalStateException("TODO");
  }
}

```
that will use `BufferedReader`, `InputStreamReader` and `FileInputStream` to read from file
and will be able to read the full text file of the file and return it at once method call.

Show in `main` how to use your class for reading text file in **try-with-resources** manner.
