package com.bwoo.designpatterns.chains_of_responsibility;

public class ErrorLogger extends AbstractLogger
{

	public ErrorLogger(int level)
	{
		super.level = level;
	}

	@Override
	protected void write(String message)
	{
		System.out.println("Error Logger: " + message);
	}

}
