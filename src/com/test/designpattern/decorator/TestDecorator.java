package com.test.designpattern.decorator;

public class TestDecorator
{
	public static void main(String[] args)
	{
//		//节点流
//		Component component = new ConcreteComponent();
//		
//		//过滤流
//		Component component2 = new ConcreteDecorator1(component);
//		
//		//过滤流
//		Component component3 = new ConcreteDecorator2(component2);
//		
		
       Component component = new ConcreteDecorator2(new ConcreteDecorator1(new ConcreteComponent()));
		
		component.doSomething();
	}
}
