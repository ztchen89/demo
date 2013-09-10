package com.test.algorithms;


/*
 * 题目：在一个字符串中找到第一个只出现一次的字符。如输入abaccdeff，则输出b。
 * 只能计算ASCII中的字符
 */
public class FirstNotRepeatChar
{
	public static char getFirstNotRepeatChar(String str)
	{
		int[] hash = new int[256];
		
//		for (int i = 0; i < hash.length; i++)
//		{
//			hash[i] = 0;
//		}
		
		for (int i = 0; i < str.length(); i++)
		{
			hash[str.charAt(i)]++;
		}
		
		for (int i = 0; i < str.length(); i++)
		{
			if(hash[str.charAt(i)] == 1)
				return str.charAt(i);
		}
		
		return 0;
	}
	
	public static void main(String[] args)
	{
		String str = "aaaa";
		System.out.println(getFirstNotRepeatChar(str));
	}
}
