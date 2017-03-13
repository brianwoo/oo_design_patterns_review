/**
 * 
 */
package com.bwoo.designpatterns.composite;

import java.util.List;

/**
 * @author bwoo
 *
 */
public class CompositeDemo
{

	public static void main(String args[]) 
	{
		Employee emp = new Employee("Brian W", "Engineering", 1000000);
		
		Employee empManager = 
				new Employee("Bill Gates", "VP Engineering", 5000000);
		
		empManager.add(emp);
		System.out.println("employee = " + empManager.toString());
		
		List<Employee> empList = empManager.getSubordinates();
		
		for (Employee eachEmp : empList) 
		{
			System.out.println("sub employee = " + eachEmp.toString());
		}
	}

}
