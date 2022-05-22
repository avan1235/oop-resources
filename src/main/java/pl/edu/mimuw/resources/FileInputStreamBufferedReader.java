package pl.edu.mimuw.resources;
import java.io.*;
import java.nio.CharBuffer;

public class FileInputStreamBufferedReader implements Readable, Closeable {
    private FileInputStream input;
    private InputStreamReader inputStreamReader;
    private BufferedReader bufferedReader;

    public FileInputStreamBufferedReader(File file) throws FileNotFoundException, IOException {
        input = new FileInputStream(file);
        inputStreamReader = new InputStreamReader(input);
        bufferedReader = new BufferedReader(inputStreamReader);
    }

    public String readText() throws IOException {
        StringBuilder sb = new StringBuilder();
        bufferedReader.lines().forEach(arg0->sb.append(arg0).append("\n"));
        return sb.toString();
    }

    @Override
    public void close() throws IOException {
        bufferedReader.close();
        
    }

    @Override
    public int read(CharBuffer arg0) throws IOException {
        return inputStreamReader.read(arg0);    
    }
}