package com.test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamReaderTest
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("file.txt");
		
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("asda");
		bw.write("\n");
		bw.write("asda");
		
		bw.close();
		
		FileInputStream fis = new FileInputStream("file.txt");
		
		InputStreamReader isr = new InputStreamReader(fis);
		
		BufferedReader br = new BufferedReader(isr);
		
		String str = br.readLine();
		
		while(null != str)
		{
			System.out.println(str);
			
			str = br.readLine();
		}
		br.close();
	}
}
