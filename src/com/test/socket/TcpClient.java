package com.test.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient
{
	public static void main(String[] args) throws Exception
	{
		Socket socket = new Socket("127.0.0.1", 5000);
		
		OutputStream os = socket.getOutputStream();
		
		InputStream is = socket.getInputStream();
		
		os.write("hello".getBytes());
		
		byte[] buffer = new byte[200];
		
		int length = is.read(buffer);
		String str = new String(buffer,0,length);
		System.out.println(str);
		
		os.close();
		is.close();
		socket.close();
	}
}
