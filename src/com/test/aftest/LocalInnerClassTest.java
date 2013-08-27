package com.test.aftest;

class LocalInner
{
	public void test()
	{
		final int a = 4;
		//�ڷ����ж���һ���ֲ��ڲ���
		class Inner3
		{
			public void dosomething()
			{
				System.out.println("Local InnerClass");
				System.out.println(a);
			}
		}
		//���þֲ��ڲ����ж���ķ���
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
