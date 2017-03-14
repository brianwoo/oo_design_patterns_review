/**
 * 
 */
package com.bwoo.designpatterns.chains_of_responsibility;

/**
 * @author bwoo
 *
 */
public class ChainDemo
{
	private static AbstractLogger getChainOfLoggers() 
	{
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	
	
	public static void main(String args[]) 
	{
		AbstractLogger logger = getChainOfLoggers();
		
		logger.logMessage(AbstractLogger.INFO, "This is an info");
		logger.logMessage(AbstractLogger.DEBUG, "This is a debug info");
		logger.logMessage(AbstractLogger.ERROR, "This is an error info");
	}
	
}
