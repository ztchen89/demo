package com.test.aftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.omg.CORBA_2_3.portable.OutputStream;

public class TestInOut implements Runnable {
	Process p = null;
	
	public TestInOut()
	{
		try 
		{
			p = Runtime.getRuntime().exec("java MyTest");
			new Thread(this).start();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void send()
	{
		OutputStream os = (OutputStream) p.getOutputStream();
		while(true)
		{
			try {
				os.write("help\r\n".getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() 
	{
		try 
		{
			InputStream in = (InputStream)p.getInputStream();
			BufferedReader bfr = new BufferedReader(new InputStreamReader(in));
			while(true)
			{
				String strLine = bfr.readLine();
				System.out.println(strLine);
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		TestInOut tio = new TestInOut();
		tio.send();
	}
}
