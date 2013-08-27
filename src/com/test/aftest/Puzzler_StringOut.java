package com.test.aftest;

/*
class String{
	private final java.lang.String s;
	
	public String(java.lang.String s)
	{
		this.s = s;
	}
	
	public java.lang.String toString()
	{
		return s;
	}
}
*/
public class Puzzler_StringOut
{
	/*
	 * main方法必须接受一个字符串数组参数
	 * VM努力告诉我们的是，StringOut.main接受的是由我们的String类构成的数组，它与java.lang.String没有任何关系、
	 * 所以会报错：
	 * java.lang.NoSuchMethodError: main
	 * Exception in thread "main" 
	 */
	public static void main(String[] args)
	{
		String s = new String("hello");
		System.out.println(s);
	}
}
