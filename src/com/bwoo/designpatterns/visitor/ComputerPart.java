package com.bwoo.designpatterns.visitor;

public interface ComputerPart
{
	public void accept(ComputerPartVisitor computerPartVisitor);
}
