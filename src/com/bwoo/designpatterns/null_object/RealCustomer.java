/**
 * 
 */
package com.bwoo.designpatterns.null_object;

/**
 * @author bwoo
 *
 */
public class RealCustomer extends AbstractCustomer
{

	/**
	 * 
	 */
	public RealCustomer(String name)
	{
		super.name = name;
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.null_object.AbstractCustomer#isNil()
	 */
	@Override
	public boolean isNil()
	{
		return false;
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.null_object.AbstractCustomer#getName()
	 */
	@Override
	public String getName()
	{
		return name;
	}

}
