/**
 * 
 */
package com.bwoo.designpatterns.builder;

/**
 * @author bwoo
 *
 */
public class Pepsi extends ColdDrink
{

	/**
	 * 
	 */
	public Pepsi()
	{
		//ctor
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.builder.Item#name()
	 */
	@Override
	public String name()
	{
		return "Pepsi";
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.builder.ColdDrink#price()
	 */
	@Override
	public float price()
	{
		return 35.0f;
	}

}
