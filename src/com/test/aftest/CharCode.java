package com.test.aftest;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;

public class CharCode {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {

		String strChina = "�й�";
		for(int i = 0; i < strChina.length(); i++)
		{
			System.out.println(Integer.toHexString((int)strChina.charAt(i)));
		}
		
		try 
		{
			byte []buf = strChina.getBytes("gb2312");
			for(int i = 0; i < buf.length; i++)
			{
				System.out.println(Integer.toHexString(buf[i]));
			}
			System.out.println("----------");
			for(int i = 0; i < buf.length; i++)
			{
				System.out.write(buf[i]);
			}
		} 
		catch (UnsupportedEncodingException e) 
		{
			e.printStackTrace();
		}
		//new DataOutputStream(new BufferedOutputStream(new FileOutputStream("1.txt")));

	}

}
