package com.test.reflection;

import java.lang.reflect.Array;

public class ArrayTest1 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception 
	{

		Class<?> classTpye = Class.forName("java.lang.String");
		Object array = Array.newInstance(classTpye, 10);
		Array.set(array, 5, "hello");
		String s = (String) Array.get(array, 5);
		System.out.print(s);

	}
}