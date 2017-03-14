/**
 * 
 */
package com.bwoo.designpatterns.visitor;

/**
 * @author bwoo
 *
 */
public interface ComputerPartVisitor
{
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
