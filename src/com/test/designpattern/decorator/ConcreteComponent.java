package com.test.designpattern.decorator;


//具体构件接口
public class ConcreteComponent implements Component
{
	@Override
	public void doSomething()
	{
		System.out.println("功能A");
	}
}
