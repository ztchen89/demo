package com;

public class OverrideTest {

	@Override
	public String toString()
	{
		return "aaa";
	}
	public static void main(String[] args) {

		OverrideTest test = new OverrideTest();
		
		System.out.print(test.toString());
	}

}
