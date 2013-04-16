package com.test.socket;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest2
{
	public static void main(String[] args) throws IOException
	{
		URL url = new URL("http://www.infoq.com");
		
		//用字符的方式来读取
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		
		while(null != (line = br.readLine()))
		{
			System.out.println(line);
		}
		
		br.close();
	}
}	
