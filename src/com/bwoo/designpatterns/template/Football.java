/**
 * 
 */
package com.bwoo.designpatterns.template;

/**
 * @author bwoo
 *
 */
public class Football extends Game
{

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.template.Game#initialize()
	 */
	@Override
	void initialize()
	{
		System.out.println("init Football");

	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.template.Game#startPlay()
	 */
	@Override
	void startPlay()
	{
		System.out.println("startPlay Football");

	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.template.Game#endPlay()
	 */
	@Override
	void endPlay()
	{
		System.out.println("endPlay Football");

	}

}
