package com.test.coreJava;

import java.net.InetAddress;

public class InetAddressTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{
			if(args.length > 0)
			{
				String host = args[0];
				InetAddress[] addresses = InetAddress.getAllByName(host);
				for(InetAddress a : addresses)
					System.out.println(a);
			}
			else
			{
				InetAddress localhostAddress = InetAddress.getLocalHost();
				System.out.println(localhostAddress);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
