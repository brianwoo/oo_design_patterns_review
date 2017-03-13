/**
 * 
 */
package com.bwoo.designpatterns.factory;

/**
 * @author bwoo
 *
 */
public class ShapeFactory
{
	
	/**
	 * Get Shape factory method
	 * 
	 * @param shape
	 * @return
	 */
	public Shape getShape(String shape)
	{
		if (null == shape) 
			return null;
		
		if (shape.equalsIgnoreCase("CIRCLE")) 
		{
			return new Circle();
		}
		else if (shape.equalsIgnoreCase("RECTANGLE")) 
		{
			return new Rectangle();
		} 
		else if (shape.equalsIgnoreCase("SQUARE"))
		{
			return new Square();
		}
		
		return null;
	}

}
