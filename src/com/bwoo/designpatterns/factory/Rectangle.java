/**
 * 
 */
package com.bwoo.designpatterns.factory;

/**
 * @author bwoo
 *
 */
public class Rectangle implements Shape
{

	/**
	 * 
	 */
	public Rectangle()
	{
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.abstractfactory.Shape#draw()
	 */
	@Override
	public void draw()
	{
		System.out.println("Rectangle: draw");
	}

}
