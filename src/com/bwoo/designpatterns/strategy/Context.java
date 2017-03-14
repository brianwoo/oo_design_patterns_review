/**
 * 
 */
package com.bwoo.designpatterns.strategy;

/**
 * @author bwoo
 *
 */
public class Context
{
	private Strategy strategy;

	/**
	 * ctor 
	 */
	public Context(Strategy strategy)
	{
		this.strategy = strategy;
	}

	public int execute(int num1, int num2)
	{
		return this.strategy.doOperation(num1, num2);
	}
	
}
