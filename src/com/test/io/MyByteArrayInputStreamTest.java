package com.test.io;

import java.io.IOException;
import java.io.InputStream;

public class MyByteArrayInputStreamTest
{
	public static void main(String[] args) throws IOException
	{
		byte[] b = new byte[16];
		
		for(int i = 0; i < b.length; i++)
		{
			b[i] = (byte) i;
		}
		
		MyByteArrayInputStream in = new MyByteArrayInputStream(b);
		
		while(true)
		{
			int c = in.read();
			
			if(c < 0)
			{
				break;
			}
			
			System.out.print(c + " ");
		}
		
//		System.out.println();
	}
}

class MyByteArrayInputStream extends InputStream
{
	protected byte[] data;
	protected int ptr = 0;
	
	public MyByteArrayInputStream(byte[] b)
	{
		this.data = b;
	}
	
	@Override
	public int read() throws IOException
	{
		return (ptr < data.length) ? (data[ptr++]) : -1;
	}
}
