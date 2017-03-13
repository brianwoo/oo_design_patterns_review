/**
 * 
 */
package com.bwoo.designpatterns.abstractfactory;

/**
 * @author bwoo
 *
 */
public class Blue implements Color
{

	/**
	 * 
	 */
	public Blue()
	{
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.abstractfactory.Color#fill()
	 */
	@Override
	public void fill()
	{
		System.out.println("Blue fill");

	}

}
