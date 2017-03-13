/**
 * 
 */
package com.bwoo.designpatterns.decorator;

/**
 * @author bwoo
 *
 */
public class RedShapeDecorator extends ShapeDecorator
{

	/**
	 * @param decoratedShape
	 */
	public RedShapeDecorator(Shape decoratedShape)
	{
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void draw()
	{
		decoratedShape.draw();
		setRedBorder();
	}
	
	
	private void setRedBorder()
	{
		System.out.println("Border Color: Red");
	}

}
