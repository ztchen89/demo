package com.test.coreJava;

/*
 * ���������л���������У�Ȼ������ء�
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
		
		//����harry���俽���Ѿ���ͬ��
		System.out.println(harry);
		System.out.println(harry2);
	}

}
