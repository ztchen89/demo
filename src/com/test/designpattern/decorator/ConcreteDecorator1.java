package com.test.designpattern.decorator;


//具体装饰角色，负责给构件对象"贴上"附加的责任，即添加新的功能
public class ConcreteDecorator1 extends Decorator
{
	public ConcreteDecorator1(Component component)
	{
		super(component);
	}
	
	@Override
	public void doSomething()
	{
		super.doSomething();
		this.doAnotherThing();
	}
	
	private void doAnotherThing()
	{
		System.out.println("功能B");
	}
}
