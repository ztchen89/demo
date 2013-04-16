package com.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest1
{
	public static void main(String[] args) throws IOException
	{
		//若该文件不存在，则创建一个；若存在，则覆盖重新写
		OutputStream os = new FileOutputStream("E:\\out.txt",true);
		
		String str = "welcome";
		byte[] buffer = str.getBytes();
		os.write(buffer);
		
		os.close();
	}
}
