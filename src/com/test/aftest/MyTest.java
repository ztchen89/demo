package com.test.aftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		while(true)
		{
			try 
			{
				System.out.println("hi : " + 
				new BufferedReader(new InputStreamReader(System.in)).readLine());
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
