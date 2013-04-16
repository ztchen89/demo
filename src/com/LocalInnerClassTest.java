package com;

class LocalInner
{
	public void test()
	{
		final int a = 4;
		//在方法中定义一个局部内部类
		class Inner3
		{
			public void dosomething()
			{
				System.out.println("Local InnerClass");
				System.out.println(a);
			}
		}
		//调用局部内部类中定义的方法
		new Inner3().dosomething();
	}
}

public class LocalInnerClassTest
{
	public static void main(String[] args)
	{
		LocalInner localInner = new LocalInner();
		localInner.test();	
	}
}
