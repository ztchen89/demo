package com.test.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//客户端
public class Client {
	public static void main(String[] args) 
	{
		RealSubject realSubject = new RealSubject();// 在这里指定被代理类
		InvocationHandler handler = new DynamicSubject(realSubject);
		
		Class<?> classType = realSubject.getClass();
		
		//以下一次性生成代理
		Subject subject = (Subject) Proxy.newProxyInstance(classType.getClassLoader(),classType.getInterfaces(), handler);
		
		subject.request();
		
		System.out.println("------------");
		System.out.println(subject.getClass());
	}
}
