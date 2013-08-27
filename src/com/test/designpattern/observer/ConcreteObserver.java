package com.test.designpattern.observer;

//����۲��߶���
public class ConcreteObserver implements Observer
{
	@Override
	public void update(String str)
	{
		System.out.println(str);
	}
}
