/**
 * 
 */
package com.bwoo.designpatterns.visitor;

/**
 * @author bwoo
 *
 */
public class Computer implements ComputerPart
{
	ComputerPart[] parts;
	
	public Computer() 
	{
		parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
	}
	
	
	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.visitor.ComputerPart#accept(com.bwoo.designpatterns.visitor.ComputerPartVisitor)
	 */
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor)
	{
		for (int i=0; i < parts.length; i++)
		{
			parts[i].accept(computerPartVisitor);
		}
		
		computerPartVisitor.visit(this);

	}

}
