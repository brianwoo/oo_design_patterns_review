/**
 * 
 */
package com.bwoo.designpatterns.chains_of_responsibility;

/**
 * @author bwoo
 *
 */
public class FileLogger extends AbstractLogger
{

	/**
	 * 
	 */
	public FileLogger(int level)
	{
		super.level = level;
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.chains_of_responsibility.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message)
	{
		System.out.println("File Logger: " + message);

	}

}
