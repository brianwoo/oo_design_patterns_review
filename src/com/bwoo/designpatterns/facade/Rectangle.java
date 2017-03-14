/**
 * 
 */
package com.bwoo.designpatterns.facade;

/**
 * @author bwoo
 *
 */
public class Rectangle implements Shape
{

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.facade.Shape#draw()
	 */
	@Override
	public void draw()
	{
		System.out.println("Rectangle draw");

	}

}
