/**
 * 
 */
package com.bwoo.designpatterns.strategy;

/**
 * @author bwoo
 *
 */
public class StrategyDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
	      
		Context context = new Context(new OperationAdd());		
	    System.out.println("10 + 5 = " + context.execute(10, 5));

	    context = new Context(new OperationSubtract());		
	    System.out.println("10 - 5 = " + context.execute(10, 5));

	    context = new Context(new OperationMultiply());		
	    System.out.println("10 * 5 = " + context.execute(10, 5));

	}

}
