package com.test.classloader;

class CL
{
	static
	{
		System.out.println("Class CL");
	}
}
public class MyTest4 
{
	public static void main(String[] args) throws Exception {
		
		//��ȡϵͳ���������
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		Class<?> clazz = loader.loadClass("com.classloader.CL");
		System.out.println("---------------");
		
		clazz = Class.forName("com.classloader.CL");
	}
	
}
