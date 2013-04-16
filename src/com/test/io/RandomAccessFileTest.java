package com.test.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest
{
	public static void main(String[] args) throws IOException
	{
		Person p = new Person(1,"sadas",5.42);
		
		RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
		
		p.write(raf);
		//raf写完已经到了文件的末尾
		
		
		
		Person p2 = new Person();
		
		raf.seek(0);//让读的位置重新回到开头
		
		p2.read(raf);
		
		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getHeight());
	}
}

class Person
{
	int id;
	String name;
	double height;
	
	public Person()
	{
		
	}
	
	
	
	public int getId()
	{
		return id;
	}



	public void setId(int id)
	{
		this.id = id;
	}



	public String getName()
	{
		return name;
	}



	public void setName(String name)
	{
		this.name = name;
	}



	public double getHeight()
	{
		return height;
	}



	public void setHeight(double height)
	{
		this.height = height;
	}



	public Person(int id,String name,double height)
	{
		this.id = id;
		this.name = name;
		this.height = height;
	}
	
	public void write(RandomAccessFile raf) throws IOException
	{
		raf.writeInt(this.id);
		raf.writeUTF(name);
		raf.writeDouble(height);
	}
	
	public void read(RandomAccessFile raf) throws IOException
	{
		this.id = raf.readInt();
		this.name = raf.readUTF();
		this.height = raf.readDouble();
	}
}
