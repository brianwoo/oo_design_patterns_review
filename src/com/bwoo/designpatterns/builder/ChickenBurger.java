/**
 * 
 */
package com.bwoo.designpatterns.builder;

/**
 * @author bwoo
 *
 */
public class ChickenBurger extends Burger
{


	@Override
	public String name()
	{
		return "Chicken Burger";
	}

	@Override
	public float price()
	{
		return 50.5f;
	}

}
