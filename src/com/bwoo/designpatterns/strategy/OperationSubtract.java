/**
 * 
 */
package com.bwoo.designpatterns.strategy;

/**
 * @author bwoo
 *
 */
public class OperationSubtract implements Strategy
{

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.strategy.Strategy#doOperation(int, int)
	 */
	@Override
	public int doOperation(int num1, int num2)
	{
		return num1 - num2;
	}

}
