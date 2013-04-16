package com;

class MemberInner
{
	private int a = 5;
	
	public class Inner2
	{
		//private int a = 5;
		public void test()
		{
			//内部类想访问外部类中的成员变量
			System.out.println(MemberInner.this.a);
		}
	}
	
	//外部类对内部类的引用
	public void method()
	{
		Inner2 inner2 = this.new Inner2();
	}
}

public class MemberInnerClassTest
{
	public static void main(String[] args)
	{
		MemberInner.Inner2 inner2 = new MemberInner().new Inner2();
		inner2.test();
	}
}
