package com.test.coreJava;

import java.io.File;
import java.io.IOException;

public class FindDirectories {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if(args.length == 0) args = new String[]{".."};
		
		File pathName = new File(args[0]);
		String[] fileNames = pathName.list();
		
		for(int i = 0; i < fileNames.length; i++)
		{
			File f = new File(pathName.getPath(),fileNames[i]);
			
			if(f.isDirectory())
			{
				try 
				{
					System.out.println(f.getCanonicalPath());
					main(new String[]{f.getPath()});
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
