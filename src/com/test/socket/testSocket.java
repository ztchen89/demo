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

			InetAddress ia = InetAddress.getLocalHost(); //获得本机IP
			System.out.println(ia.getHostName());		 //得到主机名	
			System.out.println(ia.getAddress());		 //得到主机地址
		
			 //通过主机名获得信息
			InetAddress ia2 = InetAddress.getByName("eric");
			System.out.println(ia2.getHostAddress());
		
			//通过主机IP获得信息
			InetAddress ia3 = InetAddress.getByAddress(new byte[]{(byte) 192,(byte) 168,0,86});
			System.out.println(ia3.getHostName());
		
			//根据域名到DNS查询IP
			InetAddress ia4 = InetAddress.getByName("www.163.com"); 
			System.out.println("163 IP: " + ia4.getHostAddress());
		

		/*
		 * URL实现网页静态化
		 */
//		URL url = new URL("http://www.163.com"); //获得网络资源
//		InputStream fls = url.openStream();//获得URL的输入数据流
//		InputStreamReader fr = new InputStreamReader(fls);
//		BufferedReader br = new BufferedReader(fr);    //读入并封装字符流
//		FileWriter fw = new FileWriter("D://163.html");  //保存为文件
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
