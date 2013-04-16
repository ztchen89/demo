package com.test.classloader;

class Parent
{
	static int x = 3;
	
	static
	{
		System.out.println("parent static block");
	}
}

class Child extends Parent
{
	static int y = 3;
	
	static
	{
		System.out.println("Child static block");
	}
}

public class MyTest3 
{
	static
	{
		System.out.println("MyTest3 static block");
	}
	public static void main(String[] args) {
		System.out.println("-------------");
		System.out.println(Child.x);
		System.out.println(Parent.x);
	}
}
