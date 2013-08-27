package com.test.algorithms;

/*
 * 给定一个整数N，写下从1开始，到N的所有整数，然后数一下其中出现的所有”1“的个数
 * 例如：N=12，我们会写下1,2,3,4,5,6,7,8,9,10,11，12。这样，1的个数是5
 */
public class Count1Test
{
	//统计单个整数中1的个数
	public static int count1InAInteger(int n)
	{
		int num = 0;
		while(n != 0)
		{
			num += (n % 10 == 1)? 1 : 0;
			n /= 10;
		}
		
		return num;
	}
	
	//时间复杂度O(n*lgn)
	public static int func(int n)
	{
		int count = 0;
		
		for (int i = 1; i <= n; i++)
		{
			count += count1InAInteger(i);
		}
		
		return count;
	}
	
	public static void main(String[] args)
	{
		System.out.println(func(12));
	}
}
