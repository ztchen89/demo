package com.test.coreJava;

/*
 * 将对象序列化到输出流中，然后将其读回。
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialCloneable implements Cloneable, Serializable {
	
	public Object clone()
	{
		try 
		{
			//保存对象到一个字节数组
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bout);
			out.writeObject(this);
			out.close();
			
			//从该字节数组中读取一个对象的拷贝
			ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
			ObjectInputStream in = new ObjectInputStream(bin);
			Object ret = in.readObject();
			in.close();
			
			return ret;
		} 
		catch (IOException e) 
		{
			return null;
		}
		catch (ClassNotFoundException e) 
		{
			return null;
		}
	}
}
