package com.test.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try 
		{
			FileOutputStream fos = new FileOutputStream("count.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			dos.writeUTF("ab�й�");
			dos.writeBytes("ab�й�");
			dos.writeChars("ab�й�");
			dos.close();
			
			FileInputStream fin = new FileInputStream("count.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			DataInputStream din = new DataInputStream(bin);
			System.out.println(din.readUTF());

		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
