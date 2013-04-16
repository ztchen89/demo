package com.test.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyReflection 
{
	public static void main(String[] args) throws Exception
	{
		MyTest myTest = new MyTest();
		
		Class<MyTest> c = MyTest.class;
		
		Method method = c.getMethod("output", new Class[]{});
		
		//判断该方法上面是否有MyAnnotation这个注解
		if(method.isAnnotationPresent(MyAnnotation.class))
		{
			method.invoke(myTest, new Object[]{});
			
			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
			String hello = myAnnotation.hello();
			String world = myAnnotation.world();
			
			System.out.println(hello);
			System.out.println(world);
		}

		//获取MyTest类中指定方法上的所有注解信息，并打印出来
		Annotation[] annotations = method.getAnnotations();
		for(Annotation annotation : annotations)
		{
			System.out.println(annotation.annotationType().getName());
		}
	}
}
