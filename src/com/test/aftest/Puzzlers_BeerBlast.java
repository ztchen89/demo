package com.test.aftest;

import java.io.InputStream;


public class Puzzlers_BeerBlast
{
	static final String COMMAND = "java Puzzlers_BeerBlast slave";
	public static void main(String[] args) throws Exception
	{
		if(args.length == 1 && args[0].equals("slave"))
		{
			for(int i = 99 ; i > 0; i--)
			{
				System.out.println("i = " + i);
			}
		}
		else {
			Process process = Runtime.getRuntime().exec(COMMAND);
			
			int exitValue = process.waitFor(); //
			
			System.out.println(exitValue);
		}
	}
}
