package com.test.algorithms;

/*
 * 任意给定一个32位无符号整数n，求n的二进制表示中1的个数，
 * 比如n = 5（0101）时，返回2，n = 15（1111）时，返回4
 */
public class BitCountTest
{
	public static int BitCount(int n)
	{
		int count = 0;//计数器
		
		while(n > 0)
		{
			if((n & 1) == 1) //当前位是1
				++count;	//计数器加1
			
			n >>= 1; //n移位 
		}
		
		return count;
	}
	
	public static void main(String[] args)
	{
		System.out.println(BitCount(15));
	}
}
