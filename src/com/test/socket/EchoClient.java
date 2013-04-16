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
		//�ͻ�����������������������Ϣ
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		//�ͻ��������������շ���������Ϣ
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter pw = new PrintWriter(bw,true);//װ�����������ʱˢ��
		//�����û���������
		Scanner in = new Scanner(System.in);
		String msg = null; 
		while((msg = br.readLine()) != null)
		{
			pw.println(msg);//���͸�������
			System.out.println(br.readLine()); //������������ص���Ϣ
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
