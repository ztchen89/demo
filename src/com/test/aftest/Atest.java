package com.test.aftest;

public class Atest
{
	public static void main(String[] args)
	{
		String str = null;
		
		if((str != null) && (str.length() > 10))
		{
			System.out.println("a");
		}
		else if ((str != null) & (str.length() < 5)) {
			System.out.println("b");
		}
		else {
			;
		}
	}
}
