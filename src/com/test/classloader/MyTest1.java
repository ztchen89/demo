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
		//��Ϊx�Ǳ���ʱ��ĳ����������಻�ᱻ��ʼ������̬�����Ͳ��ᱻִ��
		System.out.println(FinalTest.x);
	}
}
