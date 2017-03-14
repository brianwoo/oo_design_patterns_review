/**
 * 
 */
package com.bwoo.designpatterns.visitor;

/**
 * @author bwoo
 *
 */
public class Monitor implements ComputerPart
{

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.visitor.ComputerPart#accept(com.bwoo.designpatterns.visitor.ComputerPartVisitor)
	 */
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor)
	{
		computerPartVisitor.visit(this);

	}

}
