package com;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Sender extends Thread {
	private PipedOutputStream out = new PipedOutputStream();
	
	public PipedOutputStream getOutputStream()
	{
		return out;
	}
	
	public void run()
	{
		String strInfo = new String("hello receiver");
		try 
		{
			out.write(strInfo.getBytes());
			out.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
}
