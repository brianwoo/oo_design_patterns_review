package com.bwoo.designpatterns.observer;

public class ObserverDemo
{


	public static void main(String[] args)
	{
		Subject subject = new Subject();
		
		new OctalObserver(subject);
		new BinaryObserver(subject);
		
		subject.setState(15);
		subject.setState(0);

	}

}
