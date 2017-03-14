/**
 * 
 */
package com.bwoo.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bwoo
 *
 */
public class Broker
{

	private List<Order> orderList = new ArrayList<Order>();

	/**
	 * 
	 */
	public Broker() {}

	public void takeOrder(Order order)
	{
		orderList.add(order);
	}
	
	public void placeOrders()
	{
		for (Order order : orderList)
		{
			order.execute();
		}
		
		orderList.clear();
	}
	
	
}
