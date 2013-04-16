package com;

/*
 * 有一个数据集是String[]数组，其中有很多元素的内容是重复的，
 * 怎样新建一个数据集只保存其中不重复的记录。
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ElementRepeatTest
{
	public static void main(String[] args)
	{
		String[] oldArr = new String[]{"a","a","a","a","a","a","a","a","a","b"};
		
		Set<String> set = new HashSet<String>();
		set.addAll(Arrays.asList(oldArr));
		
		String[] arr = (String[])set.toArray(new String[0]);
		
		for(String str : arr)
		{
			System.out.println(str);
		}
	}
}
