package com.test.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest
{
	public static void main(String[] args) throws IOException
	{
		String str = "asddfsdfdsfdsfdsfdsfsd";
		
		char[] buffer = new char[str.length()];
		
		//将字符串拷贝到字符数组buffer中
		str.getChars(0, str.length(), buffer, 0);
		
		FileWriter fw = new FileWriter("file2.txt");
		
		//将buffer中的字符写到file2.txt中
		for(int i = 0; i < buffer.length; i++)
		{
			fw.write(buffer[i]);
		}
		
		fw.close();
	}
}
