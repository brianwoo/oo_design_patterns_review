/**
 * 
 */
package com.bwoo.designpatterns.singleton;

/**
 * @author bwoo
 *
 */
public class SingletonObject
{

	/**
	 * 
	 */
	private SingletonObject()	{}

	private static SingletonObject obj;
	
	public static synchronized SingletonObject getInstance() {
		
		if (null == obj)
			obj = new SingletonObject();
				
		return obj;
	}
	
	
	public void printMe() 
	{
		System.out.println("Hello World " + this);
	}
	
}
