package com.test.designpatten;

//具体观察者对象
public class ConcreteObserver implements Observer
{
	@Override
	public void update(String str)
	{
		System.out.println(str);
	}
}
