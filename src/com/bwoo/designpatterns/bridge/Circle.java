/**
 * 
 */
package com.bwoo.designpatterns.bridge;

/**
 * @author bwoo
 *
 */
public class Circle extends Shape
{
	private int x, y, radius;
	
	
	/**
	 * @param drawAPI
	 */
	public Circle(int x, int y, int radius, DrawAPI drawAPI)
	{
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.bridge.Shape#draw()
	 */
	@Override
	public void draw()
	{
		drawAPI.drawCircle(radius, x, y);
	}

}
