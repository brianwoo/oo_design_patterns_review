/**
 * 
 */
package com.bwoo.designpatterns.template;

/**
 * @author bwoo
 *
 */
public abstract class Game
{

	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	public final void play()
	{
		initialize();
		startPlay();
		endPlay();
	}

}
