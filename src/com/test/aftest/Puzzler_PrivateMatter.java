package com.test.aftest;

class Base{
    public String className = "base";
    
    public String test = "basetest";
    
    public String getClassName()
    {
    	return className;
    }
    
}

class Derived extends Base{
    private String className = "Derived";
    
    public int test = 4;
    
    public String getClassName()
    {
    	return className;
    }
}

public class Puzzler_PrivateMatter
{
	public static void main(String[] args)
	{
		//System.out.println(new Derived().className);
		//System.out.println(((Base)new Derived()).test);
		System.out.println(new Derived().getClassName());
		
	}
}
