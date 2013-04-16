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
	private final int PORT = 8888; //�˿�
	
	public EchoServer() throws IOException
	{
		serverSocket = new ServerSocket(PORT);
		System.out.println("������������");
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
			socket = serverSocket.accept(); //�ȴ���ȡ���û����ӣ��������׽���
			System.out.println("�����ӵ�ַ" + socket.getInetAddress() + socket.getPort());//�ͻ�����Ϣ
			
			//�����ַ�������ȡ�ͻ�����Ϣ
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//����ַ�������ͻ���д��Ϣ
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//װ���������true��ÿдһ�о�ˢ�����������������flush
			PrintWriter pw = new PrintWriter(bw,true);
			String info = null; //�����û�������Ϣ
			while((info = br.readLine()) != null)
			{
				System.out.println(info);//����û�������Ϣ
				pw.println("you said" + info);//��ͻ��˷����û����͵���Ϣ��println��������Զ�ˢ�»�����
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
