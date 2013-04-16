package com.test.annotation;

public class MyTargetTest
{
	@MyTarget(hello="eric")
	public void doSomething()
	{
		System.out.println("mytarget test");
	}
}