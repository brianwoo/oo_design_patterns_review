/**
 * 
 */
package com.bwoo.designpatterns.abstractfactory;

/**
 * @author bwoo
 *
 */
public class ShapeFactory extends AbstractFactory
{

	/**
	 * 
	 */
	public ShapeFactory()
	{
		// TODO Auto-generated constructor stub
	}
	

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.abstractfactory.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	public Color getColor(String color)
	{
		// TODO Auto-generated method stub
		return null;
	}

	
	
	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.abstractfactory.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
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
