package com.test.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("src\\com\\test\\io\\FileReaderTest1.java");
		
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while(null != (str = br.readLine()))
		{
			System.out.println(str);
		}
		
		br.close();
	}
}
