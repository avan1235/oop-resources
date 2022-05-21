package pl.edu.mimuw.resources;

import java.io.*;
import java.nio.CharBuffer;

public class FileInputStreamBufferedReader implements Readable, Closeable
{
	public FileInputStreamBufferedReader(File file) throws FileNotFoundException
	{
		InputStreamReader inputStreamReader = new InputStreamReader();
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		bufferedReader.close();
	}

	@Override
	public void close() throws IOException
	{

	}

	@Override
	public int read(CharBuffer charBuffer) throws IOException
	{
		return 0;
	}
}