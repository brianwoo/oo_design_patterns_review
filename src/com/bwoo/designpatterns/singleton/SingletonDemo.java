/**
 * 
 */
package com.bwoo.designpatterns.singleton;

/**
 * @author bwoo
 *
 */
public class SingletonDemo
{


	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		SingletonObject obj = SingletonObject.getInstance();
		obj.printMe();
		
		SingletonObject obj1 = SingletonObject.getInstance();
		obj1.printMe();
	}

}
