package com.test.aftest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student stu1 = new Student(19,"zhangsan",25,"cs");
		Student stu2 = new Student(20,"lishi",23,"phs");
		
		try 
		{
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(stu1);
			os.writeObject(stu2);
			os.close();
			
			FileInputStream fis = new FileInputStream("student.txt");
			ObjectInputStream ois =  new ObjectInputStream(fis);
			stu1 = (Student) ois.readObject();
			stu2 = (Student) ois.readObject();
			ois.close();
			
			System.out.println("id = " + stu1.getId());
			System.out.println("name = " + stu1.getName());
			System.out.println("age = " + stu1.getAge());
			System.out.println("department = " + stu1.getDepartment());
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
