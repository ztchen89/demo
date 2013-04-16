package com.test.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try 
		{
			//���ַ�д���ļ�
			FileOutputStream out = new FileOutputStream("hello.txt");
			out.write("hello world".getBytes());
			out.close();
			
			//���ļ��ж�������
			byte []buf = new byte[1024];
			File f = new File("hello.txt");
			FileInputStream in = new FileInputStream(f);
			int len = in.read(buf);
			
			//�����ݴ�ӡ����
			System.out.println(new String(buf,0,len));
			in.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		

	}

}
