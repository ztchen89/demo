package com.test.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 通过序列化的方式实现对象的深拷贝
 */
public class CloneTest
{
	public static void main(String[] args) throws Exception
	{
		Teacher teacher = new Teacher();
		teacher.setAge(40);
		teacher.setName("lishi");
		
		Student student = new Student();
		student.setAge(20);
		student.setName("zhangsan");
		student.setTeacher(teacher);
		
		Student stu2 = (Student) student.deepCopy();
		
		System.out.println(stu2.getAge());
		System.out.println(stu2.getName());
		System.out.println(stu2.getTeacher().getAge());
		System.out.println(stu2.getTeacher().getName());
		
		System.out.println("---------------------");
		System.out.println("stu2改变Teacher对象的值后，而student的Teacher对象的值未变");
		System.out.println("说明是深拷贝！！！");
		stu2.getTeacher().setAge(50);
		stu2.getTeacher().setName("chenwu");
		
		System.out.println(student.getTeacher().getAge());
		System.out.println(student.getTeacher().getName());
	}
}

class Teacher implements Serializable
{
	private int age;
	private String name;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
}

class Student implements Serializable
{
	private int age;
	private String name;
	private Teacher teacher;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Teacher getTeacher()
	{
		return teacher;
	}
	public void setTeacher(Teacher teacher)
	{
		this.teacher = teacher;
	}
	
	public Object deepCopy() throws Exception
	{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		//过滤流包装节点流
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		//序列化本对象
		oos.writeObject(this);
		
		//反序列化
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		//放到内存中，然后再从内存中取出来
		return ois.readObject();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
