package com.test.coreJava;

/*
 * ���������л���������У�Ȼ������ء�
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
			//�������һ���ֽ�����
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bout);
			out.writeObject(this);
			out.close();
			
			//�Ӹ��ֽ������ж�ȡһ������Ŀ���
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
