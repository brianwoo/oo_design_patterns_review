/**
 * 
 */
package com.bwoo.designpatterns.visitor;

/**
 * @author bwoo
 *
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor
{

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.visitor.ComputerPartVisitor#visit(com.bwoo.designpatterns.visitor.Computer)
	 */
	@Override
	public void visit(Computer computer)
	{
		System.out.println("Displaying Computer.");
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.visitor.ComputerPartVisitor#visit(com.bwoo.designpatterns.visitor.Mouse)
	 */
	@Override
	public void visit(Mouse mouse)
	{
		System.out.println("Displaying Mouse.");
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.visitor.ComputerPartVisitor#visit(com.bwoo.designpatterns.visitor.Keyboard)
	 */
	@Override
	public void visit(Keyboard keyboard)
	{
		System.out.println("Displaying Keyboard.");
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.visitor.ComputerPartVisitor#visit(com.bwoo.designpatterns.visitor.Monitor)
	 */
	@Override
	public void visit(Monitor monitor)
	{
		System.out.println("Displaying Monitor.");
	}

}
