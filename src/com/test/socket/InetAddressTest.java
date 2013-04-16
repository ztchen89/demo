package com.test.socket;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressTest
{
	public static void main(String[] args) throws IOException
	{
		InetAddress address = InetAddress.getLocalHost();
		
		System.out.println(address);
		
		address = InetAddress.getByName("www.baidu.com");
		System.out.println(address);
	}
}
