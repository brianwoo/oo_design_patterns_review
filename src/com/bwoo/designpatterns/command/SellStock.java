/**
 * 
 */
package com.bwoo.designpatterns.command;

/**
 * @author bwoo
 *
 */
public class SellStock implements Order
{
	private Stock stock;
	
	/**
	 * 
	 */
	public SellStock(Stock stock)
	{
		this.stock = stock;
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.command.Order#execute()
	 */
	@Override
	public void execute()
	{
		this.stock.sell();
	}

}
