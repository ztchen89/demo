package com.test.aftest;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Receiver extends Thread {
	private PipedInputStream in = new PipedInputStream();
	
	public PipedInputStream getInputStream()
	{
		return in;
	}
	
	public void run()
	{
		byte []buf = new byte[1024]; 
		try 
		{
			int len = in.read(buf);
			in.read(buf);
			System.out.println("the following comes fromsender : " + new String(buf,0,len));
			in.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
