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
		//��x�Ǳ���ʱ��Ҳ���ǵ�����ʱ���ܱ�ȷ��ʱ����ͻᱻ��ʼ������̬�����ͻᱻִ��
		System.out.println(FinalTest1.x);
	}
}
