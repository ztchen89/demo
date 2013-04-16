package com.test.reflection;

import java.lang.reflect.Method;

public class InvokerTest {

	public int add(int param1,int param2)
	{
		return param1 + param2;
	}
	
	public String echo(String msg)
	{
		return "echo: " + msg;
	}
	
	public static void main(String[] args) throws Exception
	{
		Class<?> classType = InvokerTest.class;
		Object invokerTest = classType.newInstance();
		
		Method addMethod = classType.getMethod("add", new Class[]{int.class,int.class});
		Object result = addMethod.invoke(invokerTest, new Object[]{new Integer(100),new Integer(200)});
		System.out.println((Integer)result);
		
		Method echoMethod = classType.getMethod("echo", new Class[]{String.class});
		result = echoMethod.invoke(invokerTest, new Object[]{"hello"});
		System.out.println(result);
	}

}
