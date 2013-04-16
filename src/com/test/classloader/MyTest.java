package com.test.classloader;

class Singleleton
{
	private static Singleleton singleton = new Singleleton();
	public static int counter1;
	public static int counter2 = 0;
	
	public Singleleton() 
	{
		counter1++;
		counter2++;
	}
	
	public static Singleleton getInstance()
	{
		return singleton;
	}
}

public class MyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Singleleton singleton = Singleleton.getInstance();
		System.out.println("counter1 = " + singleton.counter1);
		System.out.println("counter2 = " + singleton.counter2);
		
		
	}

}
