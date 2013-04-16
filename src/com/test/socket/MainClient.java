package com.test.socket;

import java.net.Socket;

public class MainClient
{
	public static void main(String[] args) throws Exception
	{
		Socket socket = new Socket("127.0.0.1", 6000);
		
		//启动读写线程
		
		new ClientInputThread(socket).start();
		new ClientOutputThread(socket).start();
		
		
		
		
	}
}
