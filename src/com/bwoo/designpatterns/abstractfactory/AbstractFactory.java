/**
 * 
 */
package com.bwoo.designpatterns.abstractfactory;

/**
 * @author bwoo
 *
 */
public abstract class AbstractFactory
{

	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);	
	
}
