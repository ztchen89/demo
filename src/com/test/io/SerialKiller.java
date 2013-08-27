package com.test.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

class Super implements Serializable
{
	//HashSet类里面有一个readObject()方法，这是导致错误的本源
	final Set<Super> set = new HashSet<Super>();
}

final class Sub extends Super
{
	private int id;
	
	public Sub(int id)
	{
		this.id = id;
		set.add(this);
	}
	
	public void checkInvariant()
	{
		if(!set.contains(this))
			throw new AssertionError("invariant violated");
	}
	
	@Override
	public int hashCode()
	{
		return id;
	}
	
	@Override
	public boolean equals(Object o)
	{
		return (o instanceof Sub) && (id == ((Sub)o).id);
	}
}


public class SerialKiller
{
	public static Object deepCopy(Object obj)
	{
		try
		{
			//先序列化obj
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(obj);//将obj写入内存
			
			//反序列化
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			return ois.readObject();//从内存中取出obj,不过是副本
		} catch (Exception e)
		{
			e.printStackTrace();
			throw new IllegalArgumentException(e);
		}

	}
	
	public static void main(String[] args)
	{
		Sub sub = new Sub(666);
		sub.checkInvariant();
		
		Sub subCopy = (Sub) deepCopy(sub);
		subCopy.checkInvariant();
	}
}
