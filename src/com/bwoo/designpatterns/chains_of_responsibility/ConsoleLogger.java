/**
 * 
 */
package com.bwoo.designpatterns.chains_of_responsibility;

/**
 * @author bwoo
 *
 */
public class ConsoleLogger extends AbstractLogger
{

	/**
	 * 
	 */
	public ConsoleLogger(int level)
	{
		super.level = level;
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.chains_of_responsibility.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message)
	{
		System.out.println("Console Logger: " + message);
	}

}
