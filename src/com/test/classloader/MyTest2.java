package com.test.classloader;

import java.util.Random;

class FinalTest1
{
	public static final int x = new Random().nextInt(100);
	
	static
	{
		System.out.println("Final Test1");
	}
	
}

public class MyTest2 
{

	public static void main(String[] args) 
	{
		//当x是变量时，也就是当运行时才能被确定时，类就会被初始化，静态代码块就会被执行
		System.out.println(FinalTest1.x);
	}
}
