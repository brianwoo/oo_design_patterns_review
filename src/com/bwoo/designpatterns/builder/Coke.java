/**
 * 
 */
package com.bwoo.designpatterns.builder;

/**
 * @author bwoo
 *
 */
public class Coke extends ColdDrink
{

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.builder.Item#name()
	 */
	@Override
	public String name()
	{
		return "Coke";
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.builder.ColdDrink#price()
	 */
	@Override
	public float price()
	{
		return 30.0f;
	}

}
