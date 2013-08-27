package com.test.aftest;

public class splitsTest
{
	public static void main(String[] args)
	{
		/*
		 * Dangling meta character '*' near index 0 * 错误
		 * +、*、|、\、?、^ 等符号在正则表达示中有不同意义，只需要加[]、或是\\即可！
		 */
		String[] aa = "aaa*bbb*ccc".split("*");
		
		for(int i = 0 ; i < aa.length; i++)
		{
			System.out.println("--" + aa[i]);
		}
	}
}
