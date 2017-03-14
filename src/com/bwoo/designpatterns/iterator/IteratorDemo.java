/**
 * 
 */
package com.bwoo.designpatterns.iterator;

/**
 * @author bwoo
 *
 */
public class IteratorDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		NameRepository namesRepository = new NameRepository();
		
		Iterator iter = namesRepository.getIterator();
		while(iter.hasNext())
		{
			String name = (String) iter.next();
			System.out.println(name);
		}
	}

}
