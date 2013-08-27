package com.test.aftest;

class X
{
	static C Y = new C();
	
	static class Y{
		static String z = "black";
	}
	

}

class C{
	String z = "white";
}


public class Puzzler_shadesOfGray
{
	public static void main(String[] args)
	{
		System.out.println(X.Y.z);
		
		System.out.println(((X.Y)null).z);
	}
}
