package com.test.algorithms;

import java.util.Arrays;

/*
 * 题目：给定一字符串strOriginal（全英文小写字母组成），
                       并任意给一字符串strDesc，
                       编写函数实现：
                       判断strDesc是否为strOriginal的任意排序，
                       注意重复。
                       比如：给定字符串为adcbae,那么dacbea、cabeda都是匹配的，但是dacbe、cabedg不匹配
 */

public class StringMatchTest
{
	public static boolean testStr(String strOriginal,String strDesc)
	{
		if(strOriginal == null || strOriginal.length() == 0 || strDesc == null || strDesc.length() == 0)
			return false;
		if(strOriginal.equals(strDesc))
			return true;

		//先判断两个字符串长度是否相等
		if(strOriginal.length() != strDesc.length())
		{
			return false;
		}
		
		//建立两个存放hash值的数组
		int[] hashOriginal = new int[26];
		int[] hashDesc = new int[26];
		
		//建立两个字符串各自的hash表
		for(int index = 0; index < strOriginal.length(); index++)
		{
			int indexOriginal,indexDesc;
			
			indexOriginal = strOriginal.charAt(index) - 'a';
			hashOriginal[indexOriginal] += 1;
			
			indexDesc = strDesc.charAt(index) - 'a';
			hashDesc[indexDesc] += 1;
		}
		
		return Arrays.equals(hashOriginal, hashDesc);
	}
	
	public static void main(String[] args)
	{
		String str1 = "ba";
		String str2 = "ab";
		
		if(testStr(str1, str2))
		{
			System.out.println("匹配成功！");
		}else {
			System.out.println("匹配失败！");
		}
	}
}
