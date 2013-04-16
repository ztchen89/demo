package com.test.socket;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket server = new ServerSocket(6000);
		
		while(true)
		{
			Socket socket = server.accept();
			
			//启动读写线程
			new ServerInputThread(socket).start();
			new ServerOutputThread(socket).start();
		}

	}
}
