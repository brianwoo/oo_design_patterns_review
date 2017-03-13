/**
 * 
 */
package com.bwoo.designpatterns.builder;

/**
 * @author bwoo
 *
 */
public class Wrapper implements Packing
{


	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.builder.Packing#pack()
	 */
	@Override
	public String pack()
	{
		return "Wrapper";
	}

}
