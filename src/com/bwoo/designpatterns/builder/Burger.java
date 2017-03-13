/**
 * 
 */
package com.bwoo.designpatterns.builder;

/**
 * @author bwoo
 *
 */
public abstract class Burger implements Item
{


	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.builder.Item#packing()
	 */
	@Override
	public Packing packing()
	{
		return new Wrapper();
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.builder.Item#price()
	 */
	/*
	@Override
	public abstract float price();
	*/

}
