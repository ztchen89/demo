package com.test.aftest;

class Base1{
	
	private String msg()
	{
		return "Base";
	}
	
	public String getMsg(){
		return msg();
	}
}

class Child extends Base1{
	public String getMsg(){
		return "Child";
	}
	
	public static void main(String[] args)
	{
		Child c = new Child();
		System.out.println(c.getMsg());
	}
}


public class PrivateMethodExtends
{
	public static void main(String[] args)
	{
	}
}
