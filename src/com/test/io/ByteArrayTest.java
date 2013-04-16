package com.test.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteArrayTest {

	/**
	 * Сдת���ɴ�д
	 * @param args
	 */
	public static void main(String[] args) {

//		String tmp = "sdasdasdasdasdasd";
//		byte []src = tmp.getBytes();
//		ByteArrayInputStream input = new ByteArrayInputStream(src);
//		ByteArrayOutputStream output = new ByteArrayOutputStream();
//		
//		transform(input,output);
//		byte []result = output.toByteArray();
//		System.out.println(new String(result));
//		
		transform(System.in,System.out);

	}
	
	public static void transform(InputStream in, OutputStream out)
	{
		int ch = 0;
		try 
		{
			while((ch = in.read()) != -1)
			{
				int upperCH = Character.toUpperCase((char)ch);
				out.write(upperCH);
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
