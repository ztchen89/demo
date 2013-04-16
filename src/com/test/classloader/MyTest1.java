package com.test.classloader;

class FinalTest
{
	public static final int x = 6 / 3;
	
	static
	{
		System.out.println("Final Test");
	}
	
}

public class MyTest1 
{

	public static void main(String[] args) 
	{
		//因为x是编译时候的常量，所以类不会被初始化，静态代码块就不会被执行
		System.out.println(FinalTest.x);
	}
}
