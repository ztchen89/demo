package com.test.algorithms;
/*
 * 请把从1到1000的数打印出来，但你不能使用任何的循环语句或是条件语句。更不能写1000个printf
 */
public class PrintNum
{
	public static void printNum(int n)
	{
		System.out.println(n);
		int m = n / (1000 - n);//当i等于1000的时候，由于分母为0了，会抛出异常
		printNum(n + 1);
	}
	
	public static void main(String[] args)
	{
		printNum(1);
	}
}
