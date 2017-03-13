/**
 * 
 */
package com.bwoo.designpatterns.abstractfactory;

/**
 * @author bwoo
 *
 */
public class Green implements Color
{

	/**
	 * 
	 */
	public Green()
	{
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.abstractfactory.Color#fill()
	 */
	@Override
	public void fill()
	{
		System.out.println("Green fill");

	}

}
