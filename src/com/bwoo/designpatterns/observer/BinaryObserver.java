/**
 * 
 */
package com.bwoo.designpatterns.observer;

/**
 * @author bwoo
 *
 */
public class BinaryObserver extends Observer
{

	/**
	 * 
	 */
	public BinaryObserver(Subject subject)
	{
		super.subject = subject;
		super.subject.attach(this);
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.observer.Observer#update()
	 */
	@Override
	public void update()
	{
		System.out.println("update from BinaryObserver " + subject.getState());

	}

}
