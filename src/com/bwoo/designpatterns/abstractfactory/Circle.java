package com.bwoo.designpatterns.abstractfactory;

public class Circle implements Shape
{

	public Circle()
	{
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.abstractfactory.Shape#draw()
	 */
	@Override
	public void draw()
	{
		System.out.println("Circle: draw");
	}

}
