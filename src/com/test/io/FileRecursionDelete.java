package com.test.io;

import java.io.File;

public class FileRecursionDelete
{
	//递归删除一个目录里的文件
	public static void deleteAll(File file)
	{
		if(0 == file.listFiles().length || file.isFile())
		{
			file.delete();
		}else {
			File[] files = file.listFiles();
			for(File f : files)
			{
				deleteAll(f);
				f.delete();
			}
		}
	}
	
	public static void main(String[] args)
	{
		File file = new File("c:\\test");
		deleteAll(file);
	}
}
