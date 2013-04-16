package com.test.socket;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class testSocket {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

			InetAddress ia = InetAddress.getLocalHost(); //��ñ���IP
			System.out.println(ia.getHostName());		 //�õ�������	
			System.out.println(ia.getAddress());		 //�õ�������ַ
		
			 //ͨ�������������Ϣ
			InetAddress ia2 = InetAddress.getByName("eric");
			System.out.println(ia2.getHostAddress());
		
			//ͨ������IP�����Ϣ
			InetAddress ia3 = InetAddress.getByAddress(new byte[]{(byte) 192,(byte) 168,0,86});
			System.out.println(ia3.getHostName());
		
			//����������DNS��ѯIP
			InetAddress ia4 = InetAddress.getByName("www.163.com"); 
			System.out.println("163 IP: " + ia4.getHostAddress());
		

		/*
		 * URLʵ����ҳ��̬��
		 */
//		URL url = new URL("http://www.163.com"); //���������Դ
//		InputStream fls = url.openStream();//���URL������������
//		InputStreamReader fr = new InputStreamReader(fls);
//		BufferedReader br = new BufferedReader(fr);    //���벢��װ�ַ���
//		FileWriter fw = new FileWriter("D://163.html");  //����Ϊ�ļ�
//		
//		String s = null;
//		while((s = br.readLine())!= null)
//		{
//			System.out.println(s);
//			fw.write(s);
//			
//		}
//		
//		br.close();
//		fw.flush();
//		fw.close();
		
		
		
	}

}
