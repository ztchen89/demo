package com.test.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStreamTest
{
	public static void main(String[] args) throws IOException
	{
		OutputStream os = new FileOutputStream("1.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		bos.write("sssss".getBytes());
		
//		bos.flush();
		bos.close();
		os.close();
	}
}
