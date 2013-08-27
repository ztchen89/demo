package com.test.aftest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Puzzlers_Shuffle
{
	private static Random rnd = new Random();
	
	private static void swap(Object[] a, int i, int j)
	{
		Object tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static void shuffle(Object[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			swap(a, i, rnd.nextInt(a.length));
		}
	}
	
	public static void shuffle2(Object[] a)
	{
		Collections.shuffle(Arrays.asList(a));
	}
	
	public static void main(String[] args)
	{
		Integer[] a = {1,2,3,4,5,6};
		//shuffle(a);
		shuffle2(a);
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
	}
}
