package com.test.aftest;

import java.lang.reflect.Constructor;

class Dog extends Exception
{
	public static final Dog INSTANCE = new Dog();
	
	private Dog(){}

	@Override
	public String toString()
	{
		return "woof";
	}
}

public class Puzzlers_SingletonDestory
{
	public static void main(String[] args) throws Exception
	{
		Class c = Dog.class;
		Constructor constructor = c.getDeclaredConstructor(new Class[]{});
		constructor.setAccessible(true);//取消java的访问控制检查
		
		Dog dog = (Dog) constructor.newInstance();
		
		System.out.println(dog);
		System.out.println(dog == Dog.INSTANCE);
	}
}