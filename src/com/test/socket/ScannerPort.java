package com.test.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ScannerPort {

	/**
	 * @param args
	 */
	//被static修饰的成员变量和成员方法独立于该类的任何对象。也就是说，它不依赖类特定的实例，被类的所有实例共享。
	//表示无需实例化就可以使用
	public static void scan(String host,int scope)
	{
		if(scope <= 0 || scope > 65535)
		{
			System.out.println("端口必须在0-65535之间");
			return;
		}
		Socket socket = null;
		for(int port =1;port < scope; port++)
		{
			try {
				socket = new Socket(host,scope);
				System.out.println("端口" + port + "被占用！");
			} catch (UnknownHostException e) {
				System.out.println("主机无法识别！");
			} catch (IOException e) {
				System.out.println("端口" + port + "不能连接！");
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

		String host = "222.197.201.151"; //要扫描的主机
		int scope = 1024;
		ScannerPort.scan(host, scope);
	}

}
