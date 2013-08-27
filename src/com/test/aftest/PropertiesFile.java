package com.test.aftest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Long startTime = System.currentTimeMillis();
		Properties props = System.getProperties();
//		FileInputStream in;
//		try 
//		{
//			in = new FileInputStream("count.txt");
//			props.load(in);
//		} 
//		catch (FileNotFoundException e) 
//		{
//			props.setProperty("count", String.valueOf(0));
//		}
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
//		
//		int c = Integer.parseInt(props.getProperty("count")) + 1;
//		System.out.println("���ǵ�" + c + "������");
//		
//		props.setProperty("count", new Integer(c).toString());
//		
//		try 
//		{
//			props.store(new FileOutputStream("count.txt"), "Program has used");
//		} 
//		catch (FileNotFoundException e) 
//		{
//			e.printStackTrace();
//		} 
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
//		
//		Long endTime = System.currentTimeMillis();
//		System.out.println("The Running Time is " + (endTime - startTime));
		Enumeration<?> e = props.propertyNames();
		while(e.hasMoreElements())
		{
			String key = (String)e.nextElement();
			System.out.println(key + "= "  + props.getProperty(key));
		}
		Process p = null;
		try 
		{
			p = Runtime.getRuntime().exec("notepad.exe PropertiesFile.java");
			Thread.sleep(5000);
			p.destroy();
		} catch (IOException e1) 
		{
			e1.printStackTrace();
		}
		catch (InterruptedException e1) 
		{
			e1.printStackTrace();
		}

	}

}
