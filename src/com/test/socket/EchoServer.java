package com.test.socket;

import java.io.BufferedReader;
//import java.net.URLStreamHandlerFactory;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	ServerSocket serverSocket;
	private final int PORT = 8888; //端口
	
	public EchoServer() throws IOException
	{
		serverSocket = new ServerSocket(PORT);
		System.out.println("服务器启动！");
	}
	

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		new EchoServer().service();
	}
	public void service() throws IOException
	{
		Socket socket = null;
		while(true)
		{
			socket = serverSocket.accept(); //等待并取出用户连接，并创建套接字
			System.out.println("新连接地址" + socket.getInetAddress() + socket.getPort());//客户端信息
			
			//输入字符流，读取客户端信息
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//输出字符流，向客户端写信息
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//装饰输出流，true，每写一行就刷新输出缓冲区，不用flush
			PrintWriter pw = new PrintWriter(bw,true);
			String info = null; //接受用户输入信息
			while((info = br.readLine()) != null)
			{
				System.out.println(info);//输出用户输入信息
				pw.println("you said" + info);//向客户端返回用户发送的消息，println输出完后会自动刷新缓冲区
				if(info.equals("quit"))
				{
					break;
				}
				
			}
			
			if(null != socket)
			{
				socket.close();
				
			}
			
		//	String s = "w2YFY7QQf6z3COflpWvS6TlJCTO?/ziuq/moc.oaboat.deu//:ptth".toCharArray().
		}
		
	}

}
