package com.test.thread;

import java.util.Arrays;

public class Puzzlers_ThreadJoin
{
	private static boolean initialized = false;
	
	static{
		Thread t = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				initialized = true;
			}
		});
		t.start();
		
		try
		{
			t.join();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		//int i = -(2147483648);
		System.out.println(initialized);
	}
}
