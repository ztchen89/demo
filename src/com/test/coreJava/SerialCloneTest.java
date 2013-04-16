package com.test.coreJava;

/*
 * 将对象序列化到输出流中，然后将其读回。
 */
public class SerialCloneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee harry = new Employee("eric",35000,1989,10,1);
		//clone harry
		Employee harry2 = (Employee) harry.clone();
		
		//mutate harry
		harry.raiseSalary(10);
		
		//现在harry和其拷贝已经不同了
		System.out.println(harry);
		System.out.println(harry2);
	}

}
