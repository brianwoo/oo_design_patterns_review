/**
 * 
 */
package com.bwoo.designpatterns.facade;

/**
 * @author bwoo
 *
 */
public class FacadeDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();

	}

}
