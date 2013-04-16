package com.test.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamWriter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try 
		{
			FileWriter out = new FileWriter("world.txt");
			out.write("world");
			out.flush();
			//out.close();
			
			char []buf = new char[1024];
			FileReader in = new FileReader("world.txt");
			int len = in.read(buf);
			System.out.println(new String(buf,0,len));
			in.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}


	}

}
