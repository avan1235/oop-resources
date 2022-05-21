package pl.edu.mimuw.resources;

public abstract class AbstractException extends Exception
{
	AbstractException(String message)
	{
		super(message);
	}
}