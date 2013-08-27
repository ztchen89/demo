package com.test.aftest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("zhangsan",23);
		Employee e2 = new Employee("lishi",24);
		Employee e3 = new Employee("wangwu",25);
		
		try 
		{
			RandomAccessFile ra = new RandomAccessFile("Employee.txt","rw");
			ra.writeChars(e1.name);
			ra.writeInt(e1.age);
			ra.writeChars(e2.name);
			ra.writeInt(e2.age);
			ra.writeChars(e3.name);
			ra.writeInt(e3.age);
			ra.close();
			
//			int len = 0;
//			byte []buf = new byte[8];
//			String strName = null;
			//RandomAccessFile raf = new RandomAccessFile("")
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
