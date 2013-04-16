package com.test.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteArrayOutputStreamTest
{

	public static void main(String[] args) throws IOException
	{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		String str = "aadsada";
		
		byte[] buffer = str.getBytes();
		
		bos.write(buffer);
		
		byte[] b = bos.toByteArray();
		
		for(int i = 0; i < b.length; i++)
		{
			System.out.println((char)b[i]);
		}
		
		//将字节数组直接写到输出流里
		OutputStream os = new FileOutputStream("1.txt");
		
		bos.writeTo(os);
		
		bos.close();
		os.close();
	}
}
