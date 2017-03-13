/**
 * 
 */
package com.bwoo.designpatterns.abstractfactory;

/**
 * @author bwoo
 *
 */
public class ColorFactory extends AbstractFactory
{

	/**
	 * 
	 */
	public ColorFactory()
	{
		// TODO Auto-generated constructor stub
	}
	

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.abstractfactory.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	public Color getColor(String color)
	{
		if (null == color) 
			return null;
		
		if (color.equalsIgnoreCase("RED")) 
		{
			return new Red();
		}
		else if (color.equalsIgnoreCase("GREEN")) 
		{
			return new Green();
		} 
		else if (color.equalsIgnoreCase("BLUE"))
		{
			return new Blue();
		}
		
		return null;
	}

	
	
	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.abstractfactory.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	public Shape getShape(String shape)
	{
		return null;
	}

}
