package com.test.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		File f = new File("1.txt");
		if(f.exists())
		{
			f.delete();
			System.out.print("dd");
		}
		else
		{
			try 
			{
				f.createNewFile();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("File name " + f.getName());
		System.out.println("File path " + f.getPath());
		System.out.println("File abs_path " + f.getAbsolutePath());
		System.out.println("File parent " + f.getParent());
		System.out.println(f.exists() ? "exist" : "not exist");
		System.out.println(f.canRead() ? "read" : "not read");
		System.out.println(f.isDirectory() ? "Directory" : "not Directory");
		System.out.println("File last modified " + new Date(f.lastModified()));
	}

}
