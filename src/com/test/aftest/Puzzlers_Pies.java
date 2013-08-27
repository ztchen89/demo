package com.test.aftest;

import java.util.Arrays;
import java.util.Comparator;

public class Puzzlers_Pies
{
	public static void main(String[] args)
	{
//		int count = 0;
//		
//		for (int i = 0; i < 100; i++);{
//			count++;
//		}
//		
//		System.out.println(count);
		
		/*-------------------------------------*/
		
		Integer[] a = {3,1,4,1,5,7};
		
		Arrays.sort(a, new Comparator<Integer>()
		{
			@Override
			public int compare(Integer o1, Integer o2)
			{
				return o1 < o2 ? -1 : (o2 > o1 ? 1 : 0);//比较器有问题
			}
		});
		
		System.out.println(Arrays.toString(a));
		
		/*-------------------------------------*/
		System.out.println((true?false:true) == (true?false:true));
	}
}
