/**
 * 
 */
package com.bwoo.designpatterns.template;

/**
 * @author bwoo
 *
 */
public class TemplateDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Game game = new Football();
		game.play();
		
		Game game1 = new Cricket();
		game1.play();

	}

}
