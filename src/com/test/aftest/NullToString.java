package com.test.aftest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class NullToString
{
	public static void main(String[] args)
	{
		List list = new ArrayList();
		list.add(null);
		list.add(null);
		
		Set set = new HashSet();
		set.add(null);
		set.add(null);
		
		Iterator iter = set.iterator(); 
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
		String greeting = "fff";
		
		for(int i = 0; i < greeting.length(); i++)
		{
			System.out.write(greeting.charAt(i));	
			
		}
		System.out.flush();
		
		
//		for(int i = 0; i < list.size(); i++)
//		{
//			System.out.println((String)list.get(i));
//			System.out.println(((String)list.get(i)).toString());
//		}
//		System.out.println();
	}
}
