/**
 * 
 */
package com.bwoo.designpatterns.null_object;

/**
 * @author bwoo
 *
 */
public class NullCustomer extends AbstractCustomer
{

	/**
	 * 
	 */
	public NullCustomer()
	{}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.null_object.AbstractCustomer#isNil()
	 */
	@Override
	public boolean isNil()
	{
		return true;
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.null_object.AbstractCustomer#getName()
	 */
	@Override
	public String getName()
	{
		return "Not Available in Customer DB";
	}

}
