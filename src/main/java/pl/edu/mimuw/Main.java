package pl.edu.mimuw;

import pl.edu.mimuw.resources.*;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main
{

	public static void main(String[] args) throws Exception
	{
//		task1();
//		task2();

		try (FileReader fr = new FileReader("."))
		{
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
		}
	}
	private static void task1()
	{
		try
		{
			RandomExceptionUtils.justThrow();
		}
		catch (ExceptionA | ExceptionB e)
		{
			System.out.println("a or b");
			System.out.println(e);
		}
		catch (ExceptionC e)
		{
			System.out.println("just c");
			System.out.println(e);
		}
		catch (AbstractException e)
		{
			System.out.println("some unknown exception type");
			System.out.println(e);
		}
		catch (ExceptionD e)
		{
			System.out.println("just d");
			System.out.println(e);
		}
	}

	private static void task2() throws Exception
	{
//		task21();
//		task22();
//		task23();
//		task24();
//		task25();
		task26();
	}

	private static void task21()
	{
		StringUtils.printLength(null);
	}

	private static void task22()
	{
		try
		{
			StringUtils.printLength(null);
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
		}
	}

	private static void task23()
	{
		try
		{
			StringUtils.printLength(null);
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
			throw e;
		}
	}

	private static void task24()
	{
		try
		{
			StringUtils.printLength(null);
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
			e.fillInStackTrace();
			throw e;
		}
	}

	private static void task25() throws Exception
	{
		try
		{
			StringUtils.printLength(null);
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
			e.fillInStackTrace();
			throw new Exception();
		}
	}

	private static void task26() throws Exception
	{
		try
		{
			StringUtils.printLength(null);
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
			e.fillInStackTrace();
			throw new Exception(e);
		}
	}
}
