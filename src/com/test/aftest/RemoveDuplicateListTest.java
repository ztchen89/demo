package com.test.aftest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateListTest
{
	/*
	 * List去重并且保持原有List有序
	 * 
	 */
	
	//方法一
	public static List<String> removeDuplicateWithOrder(List<String> list)
	{
		Set<String> set = new HashSet<String>();
		
		List<String> newList = new ArrayList<String>();
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext())
		{
			String str = iter.next();
			
			if(set.add(str))
			{
				newList.add(str);
			}
		}
		
		return newList;
	}
	
	//方法二
	public static List<String> removeDuplicateWithOrder2(List<String> list) { 
        List<String> newList = new ArrayList<String>(); 
        for (String o : list) { 
            if (!newList .contains(o)) 
            	newList.add(o); 
        } 
        return newList; 
    } 	
	
	//方法三
	public static List<String> removeDuplicateWithOrder3(List<String> list)
	{
		return new ArrayList<String>(new LinkedHashSet<String>(list));
	}
	
	
	
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		list.add("aa");
		list.add("bb");
		
		List<String> newList = removeDuplicateWithOrder3(list);
		
		
		System.out.println(newList.toString());
		
		System.out.println(Integer.MAX_VALUE+1);
		
	}
}
