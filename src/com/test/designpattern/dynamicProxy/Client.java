package com.test.designpattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//�ͻ���
public class Client {
	public static void main(String[] args) 
	{
		RealSubject realSubject = new RealSubject();// ������ָ����������
		InvocationHandler handler = new DynamicSubject(realSubject);
		
		Class<?> classType = realSubject.getClass();
		
		//����һ������ɴ���
		Subject subject = (Subject) Proxy.newProxyInstance(classType.getClassLoader(),classType.getInterfaces(), handler);
		
		subject.request();
		
		System.out.println("------------");
		System.out.println(subject.getClass());
	}
}
