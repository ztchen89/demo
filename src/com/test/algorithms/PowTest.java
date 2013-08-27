package com.test.algorithms;

/*
 * 求幂运算
 */
public class PowTest
{
	public static long pow(long x, int n)
	{
		if(n == 0)
			return 1;
		if(n == 1)
			return x;
		if(n % 2 == 0)
		{
			return pow(x * x, n / 2);
		}
		else {
			return pow(x * x, n / 2) * x;
		}
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(pow(2, 3));
		System.out.println(Math.pow(2, 3));
	}
}
