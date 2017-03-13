package com.bwoo.designpatterns.factory;

public class Square implements Shape
{

	public Square()
	{
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.abstractfactory.Shape#draw()
	 */
	@Override
	public void draw()
	{
		System.out.println("Square: draw");
	}

}
