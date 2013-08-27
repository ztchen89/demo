package com.test.coreJava;
/*
 * 测试子类是否可以继承父类的静态方法
 * 
 */
class A
{
	public static void method()
	{
		System.out.println("A method");
	}
}

class B extends A
{
	public static void method()
	{
		System.out.println("B method");
	}
}
public class StaticMethodExtendsTest
{
	public static void main(String[] args)
	{
		A a = new A();
		A b = new B();
		//B b = new B();
		B.method();
		//a.method();
		//b.method();
	}
}
