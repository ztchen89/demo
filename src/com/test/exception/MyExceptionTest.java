package com.test.exception;

public class MyExceptionTest
{
	public void method(String str) throws MyException
	{
		if(null == str)
		{
			throw new MyException("������ַ�����������Ϊnull");
		}
		else 
		{
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) throws MyException
	{
		MyExceptionTest ex = new MyExceptionTest();
		ex.method(null);
	}
}
