package com.test.socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest
{
	public static void main(String[] args) throws IOException
	{
		URL url = new URL("http://www.infoq.com");
		
		URLConnection conn = url.openConnection();
		
		InputStream is = conn.getInputStream();
		
		//该语句与上面两句效果相等
		//InputStream is = url.openStream();
		
		OutputStream os = new FileOutputStream("d:\\baidu.txt");
		
		byte[] buffer = new byte[2048];
		
		int length = 0;
		
		while(-1 != (length = is.read(buffer, 0, buffer.length)))
		{
			os.write(buffer, 0, length);
		}
		
		is.close();
		os.close();
	}
}	
