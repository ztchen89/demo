package com.test.thread;

/**
 * @author  �ж��߳��Ƿ�����
 * */

public class isThreadAlive implements Runnable {

	@Override
	public void run() {
		
		for(int i = 0; i < 3 ; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		isThreadAlive ita = new isThreadAlive();
		Thread demo = new Thread(ita);
		System.out.println("�߳�����ǰ--��" + demo.isAlive());
		demo.start();
		System.out.println("�߳�������--��" + demo.isAlive());
		
	}

}
