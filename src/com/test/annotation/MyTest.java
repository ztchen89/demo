package com.test.annotation;

public class MyTest 
{
	@MyAnnotation(world = "teng")
	public void output() 
	{
		System.out.println("output something");
	}
}
