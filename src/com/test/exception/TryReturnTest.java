package com.test.exception;

public class TryReturnTest
{
	public void method()
	{
		try
		{
			System.out.println("����try��");
			//return;
			System.exit(0);
		}
		catch (Exception e)
		{
			System.out.println("�쳣������");
		}
		finally
		{
			System.out.println("���뵽finally��");
		}
		
		System.out.println("�쳣��������Ĵ���");
	}
	
	public static void main(String[] args)
	{
		TryReturnTest trt = new TryReturnTest();
		trt.method();
	}
}
