package com.test.proxy;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Subject sub = new RealSubject();//父类的引用可以指向子类的对象
		
		sub.request();
	}

}
