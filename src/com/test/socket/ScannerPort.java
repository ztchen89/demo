package com.test.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ScannerPort {

	/**
	 * @param args
	 */
	//��static���εĳ�Ա�����ͳ�Ա���������ڸ�����κζ���Ҳ����˵�������������ض���ʵ�������������ʵ������
	//��ʾ����ʵ�����Ϳ���ʹ��
	public static void scan(String host,int scope)
	{
		if(scope <= 0 || scope > 65535)
		{
			System.out.println("�˿ڱ�����0-65535֮��");
			return;
		}
		Socket socket = null;
		for(int port =1;port < scope; port++)
		{
			try {
				socket = new Socket(host,scope);
				System.out.println("�˿�" + port + "��ռ�ã�");
			} catch (UnknownHostException e) {
				System.out.println("�����޷�ʶ��");
			} catch (IOException e) {
				System.out.println("�˿�" + port + "�������ӣ�");
			}
			finally{
				if(null !=socket)
				{
					try {
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	public static void main(String[] args) {

		String host = "222.197.201.151"; //Ҫɨ�������
		int scope = 1024;
		ScannerPort.scan(host, scope);
	}

}
