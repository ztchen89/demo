package com.test.proxy;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Subject sub = new RealSubject();//��������ÿ���ָ������Ķ���
		
		sub.request();
	}

}
