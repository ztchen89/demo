package com.test.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream
{
	public static void main(String[] args) throws IOException
	{
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.txt")));
		
		byte b = 3;
		int i = 12;
		char ch = 'a';
		float f = 3.3f;
		
		dos.writeByte(b);
		dos.writeInt(i);
		dos.writeChar(ch);
		dos.writeFloat(f);
		
		//千万要记得关闭输入输出流
		dos.close();
		
		DataInputStream din = new DataInputStream(new BufferedInputStream(new FileInputStream("data.txt")));
		
		System.out.println(din.readByte());
		System.out.println(din.readInt());
		System.out.println(din.readChar());
		System.out.println(din.readFloat());
		
		din.close();
	}
}
