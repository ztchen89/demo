package com.test.generic;

import java.util.Arrays;
import java.util.List;

public class Pair<T>
{
	private final T first;
	private final T second;
	
	public Pair(T firsr, T second)
	{
		this.first = firsr;
		this.second = second;
	}
	
	public T first()
	{
		return first;
	}
	
	public T second()
	{
		return second;
	}
	
	public List<String> stringList()
	{
		return Arrays.asList(String.valueOf(first), 
				String.valueOf(second));
	}
	
	public static void main(String[] args)
	{
		//Pair p = new Pair<Object>(23, "hello"); //错误
		Pair<Object> p = new Pair<Object>(23, "hello");
		
		System.out.println(p.first + " " + p.second);
		
//		List<String> list = p.stringList();
//		Iterator<String> s = list.iterator(); 
//		while(s.hasNext())
//		{
//			String ss = s.next();
//			System.out.println(ss);
//		}
		
		for(String s : p.stringList())
		{
			System.out.println(s + "");
		}
	}
}
