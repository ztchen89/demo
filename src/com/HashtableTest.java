package com;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<MyKey, Integer> numbers = new Hashtable<MyKey, Integer>();
		numbers.put(new MyKey("zhangsan",18), new Integer(1));
		numbers.put(new MyKey("lishi",16), new Integer(3));
		numbers.put(new MyKey("xiaoteng",18), new Integer(2));
		
		Enumeration<MyKey> e = numbers.keys();
		while(e.hasMoreElements())
		{
			MyKey key = (MyKey) e.nextElement();
			System.out.print(key.toString() + "=");
			System.out.println(numbers.get(key));
		}
	}
}
