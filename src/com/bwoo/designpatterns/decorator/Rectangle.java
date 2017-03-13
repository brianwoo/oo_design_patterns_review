/**
 * 
 */
package com.bwoo.designpatterns.decorator;

/**
 * @author bwoo
 *
 */
public class Rectangle implements Shape
{


	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.decorator.Shape#draw()
	 */
	@Override
	public void draw()
	{
		System.out.println("Shape: Rectangle");
	}

}
