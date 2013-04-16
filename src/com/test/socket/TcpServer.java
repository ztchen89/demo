package com.test.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket server = new ServerSocket(5000);
		
		Socket socket = server.accept();
		
		InputStream is = socket.getInputStream();
		
		OutputStream os = socket.getOutputStream();
		
		byte[] buffer = new byte[200];
		
		int length = is.read(buffer);
		
		String str = new String(buffer, 0, length);
		
		System.out.println(str);
		
		os.write("world".getBytes());
		
		is.close();
		os.close();
		socket.close();
	}
}
