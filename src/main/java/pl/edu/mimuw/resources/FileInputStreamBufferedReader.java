package pl.edu.mimuw.resources;

import java.io.*;
import java.nio.CharBuffer;

public class FileInputStreamBufferedReader implements Readable, Closeable
{
	private final FileInputStream fileInputStream;
	private final InputStreamReader inputStreamReader;
	private final BufferedReader bufferedReader;

	public FileInputStreamBufferedReader(File file) throws FileNotFoundException
	{
		fileInputStream = new FileInputStream(file);
		inputStreamReader = new InputStreamReader(fileInputStream);
		bufferedReader = new BufferedReader(inputStreamReader);
	}

	@Override
	public void close() throws IOException
	{
		bufferedReader.close();
		inputStreamReader.close();
		fileInputStream.close();
	}

	@Override
	public int read(CharBuffer cb) throws IOException
	{
		return bufferedReader.read();
	}

	public String readWholeFile() throws IOException
	{
		var sb = new StringBuilder();
		String s;
		while ((s = bufferedReader.readLine()) != null)
			sb.append(s);
		return sb.toString();
	}
}