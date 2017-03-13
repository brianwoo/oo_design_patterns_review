/**
 * 
 */
package com.bwoo.designpatterns.abstractfactory;

/**
 * @author bwoo
 *
 */
public class Red implements Color
{

	/**
	 * 
	 */
	public Red()
	{
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.abstractfactory.Color#fill()
	 */
	@Override
	public void fill()
	{
		System.out.println("Red fill");

	}

}
