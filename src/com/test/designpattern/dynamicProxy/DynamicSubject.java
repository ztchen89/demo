package com.test.designpattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * �ô�������ڲ�����ΪObject�࣬ʵ��ʹ��ʱͨ�����Ĺ��캯��DynamicSubject(Object obj)���丳ֵ��
 * ���⣬�ڸ��໹ʵ����invoke�������÷����е� method.invoke(sub,args);
 * ��ʵ���ǵ��ñ��������Ľ�Ҫ��ִ�еķ�������������sub��ʵ�ʵı��������
 * argsΪִ�б����������Ӧ��������Ĳ���
 * ͨ��̬�����࣬���ǿ����ڵ���֮ǰ��֮��ִ��һЩ��ز���
 */

//���?���� 
public class DynamicSubject implements InvocationHandler 
{
	private Object sub;
	
	public DynamicSubject() 
	{
	}

	//��̬����,����ʲô���󶼿��ԣ����ر��޶�
	public DynamicSubject(Object obj) 
	{
		sub = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable 
	{
		System.out.println("before calling " + method);
		
		method.invoke(sub, args);
		
		System.out.println("after calling " + method);
		return null;
	}
}
