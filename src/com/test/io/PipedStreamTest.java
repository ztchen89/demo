package com.test.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import com.test.aftest.Receiver;
import com.test.aftest.Sender;

public class PipedStreamTest extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Sender s1 = new Sender();
		Receiver r1 = new Receiver();
		PipedOutputStream out = s1.getOutputStream();
		PipedInputStream in = r1.getInputStream();
		try 
		{
			out.connect(in);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		s1.start();
		r1.start();
	}
}
