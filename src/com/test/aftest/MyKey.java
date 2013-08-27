package com.test.aftest;

public class MyKey {
	private String name = null;
	private int age = 0;
	
	public MyKey(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof MyKey)
		{
			MyKey temp = (MyKey)obj;
			if(name.equals(temp.name) && age == temp.age)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	public int hashcode()
	{
		return name.hashCode() + age;
	}
	
	public String toString()
	{
		return name + "," + age;
	}

}
