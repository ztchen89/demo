package com.test.aftest;

class MemberInner
{
	private int a = 5;
	
	public class Inner2
	{
		//private int a = 5;
		public void test()
		{
			//�ڲ���������ⲿ���еĳ�Ա����
			System.out.println(MemberInner.this.a);
		}
	}
	
	//�ⲿ����ڲ��������
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
