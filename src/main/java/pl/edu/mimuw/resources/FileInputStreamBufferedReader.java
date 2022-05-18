package pl.edu.mimuw.resources;
import java.io.*;
import java.nio.CharBuffer;

public class FileInputStreamBufferedReader implements Readable, Closeable {

    public FileInputStreamBufferedReader(File file) throws FileNotFoundException {
        InputStreamReader inputStreamReader = new InputStreamReader();
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        bufferedReader.close();
    }

    public String readText() throws IOException {
        throw new IllegalStateException("TODO");
    }

    @Override
    public void close() throws IOException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int read(CharBuffer arg0) throws IOException {
        // TODO Auto-generated method stub
        return 0;
    }
}