package com.test.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectCopyTest {

	public Object copy(Object object) throws Exception {
		// 获取对象的类型
		Class<?> classType = object.getClass();
		System.out.println("Class:" + classType.getName());

		// 通过默认的构造方法创建一个新的对象
		Object objectCopy = classType.getConstructor(new Class[] {})
				.newInstance(new Object[] {});
		// 获取对象的所有属性
		Field[] fields = classType.getDeclaredFields();
		int fieldsLength = fields.length;

		for (int i = 0; i < fieldsLength; i++) {
			Field field = fields[i];

			String fieldName = field.getName();
			String firstLetter = fieldName.substring(0, 1).toUpperCase();
			String getMethodName = "get" + firstLetter + fieldName.substring(1);
			String setMethodName = "set" + firstLetter + fieldName.substring(1);

			Method getMethod = classType.getMethod(getMethodName,
					new Class[] {});
			Method setMethod = classType.getMethod(setMethodName,
					new Class[] { field.getType() });

			// 调用原对象的getXXX()方法
			Object value = getMethod.invoke(object, new Object[] {});
			System.out.println(fieldName + ":" + value);
			// 调用拷贝对象的setXXX()方法
			setMethod.invoke(objectCopy, new Object[] { value });
		}

		return objectCopy;
	}

	public static void main(String[] args) throws Exception {

		Customer customer = new Customer("Tom",21);
		customer.setId(new Long(1));

		Customer customerCopy = (Customer) new ReflectCopyTest().copy(customer);
		System.out.println("Copy information: " + customerCopy.getId() + " "
				+ customerCopy.getName() + " " + customerCopy.getAge());
	}

}

class Customer {
	private Long id;
	private String name;
	private int age;

	public Customer() {

	}

	public Customer( String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
