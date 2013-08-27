package com.test.aftest;

public class Employee {
	public String name = null;
	public int age = 0;
	public static final int LEN = 8;
	
	public Employee(String name, int age)
	{
		if(name.length() > LEN)
		{
			name = name.substring(0, 8);
		}
		else
		{
			while(name.length() < LEN)
			{
				name += "\u0000";
			}
				
		}
		this.name = name;
		this.age = age;
	}
}
