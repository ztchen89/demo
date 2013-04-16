package com.test.io;

/*
 * 给定任意一个目录，以树形方式展现出该目录中所有的子目录和文件。
 * 另外，在展现的时候讲目录排在上面，文件排在下面。每一层要加上缩进。
 */
import java.io.File;
import java.util.ArrayList;

public class FileListAllTest
{
	//用于判断目录或者文件所处的层次
	private static int level;

	//递归显示文件及其文件
	public static void deepList(File file)
	{
		if(0 ==file.listFiles().length || file.isFile())
		{
			return;
		}else {
			File[] files = file.listFiles();
			
			files = sort(files);
			
			for(File f : files)
			{
				StringBuffer output = new StringBuffer();
				
				if(f.isFile())
				{
					output.append(getTabs(level));
					output.append(f.getName());
				}else {
					output.append(getTabs(level));
					output.append(f.getName());
					output.append("\\");
				}
				
				System.out.println(output);
				
				if(f.isDirectory())
				{
					level++;
					
					deepList(f);
					
					level--;
					
				}
			}
		}
	}
	
	//整理文件数组，使得目录排在文件之前
	public static File[] sort(File[] files)
	{
		ArrayList<File> sorted = new ArrayList<File>();
		
		//寻找到所有的目录
		for(File f : files)
		{
			if(f.isDirectory())
			{
				sorted.add(f);
			}
		}
		
		//寻找到所有的文件
		for(File f : files)
		{
			if(f.isFile())
			{
				sorted.add(f);
			}
		}
		
		return sorted.toArray(new File[files.length]);
	}
	
	//判断需要加多少Tab的方法
	public static String getTabs(int level)
	{
		StringBuffer buffer = new StringBuffer();
		
		for(int i = 0; i < level; i++)
		{
			buffer.append("\t");
		}
		
		return buffer.toString();
	}
	
	public static void main(String[] args)
	{
		File file = new File("E:/KuGou");
		deepList(file);
	}
}
