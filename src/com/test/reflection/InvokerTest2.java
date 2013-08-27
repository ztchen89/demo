package com.test.reflection;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InvokerTest2
{
	public static void main(String[] args) throws Exception
	{
		Set<String> set = new HashSet<String>();
		
		set.add("dd");
		
		Iterator<String> it = set.iterator();
		
		Method m = it.getClass().getMethod("hasNext",new Class[]{});
		
		//Method m2 = Iterator.class.getMethod("hasNext");
		//System.out.println(m2.invoke(it));
		
		//值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。
		//值为 false 则指示反射的对象应该实施 Java 语言访问检查。
		//m.setAccessible(true);
		
		/*
		 * 这里报错的原因并不在于该方法的访问级别，而是在于该方法所在的类型的访问级别。
		 * 在java解惑78中有详细描述。
		 */
		
		System.out.println(m.invoke(it, new Object[]{}));
	}
}
