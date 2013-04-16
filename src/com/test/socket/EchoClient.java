package com.test.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient {

	static final int PORT = 8888;
	static final String host = "192.168.1.235";
	Socket socket;
	
	public EchoClient() throws UnknownHostException, IOException
	{
		socket = new Socket(host,PORT);
	}
	
	public void send() throws IOException
	{
		//客户端输出流，向服务器发送消息
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		//客户端输入流，接收服务器的消息
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter pw = new PrintWriter(bw,true);//装饰输出流，及时刷新
		//接收用户键盘输入
		Scanner in = new Scanner(System.in);
		String msg = null; 
		while((msg = br.readLine()) != null)
		{
			pw.println(msg);//发送给服务器
			System.out.println(br.readLine()); //输出服务器返回的消息
			if(msg.equals("quit"))
			{
				break;
			}
		}
		
		if(null != socket)
		{
			socket.close();
		}
		
		
		
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		new EchoClient().send();
	}

}
