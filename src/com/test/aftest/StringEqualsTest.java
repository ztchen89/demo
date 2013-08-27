package com.test.aftest;

public class StringEqualsTest
{
	public static void main(String[] args)
	{
		String a = null;
		String b = null;
		
		String c = "";
		String d = "";
		
		String aa = "a";
		String bb = new String("a");
		
		System.out.println("a == b ?" + (a == b));
		System.out.println("c == d ?" + (c == d));
		System.out.println("aa == bb ?" + (aa == bb));
	}
}
