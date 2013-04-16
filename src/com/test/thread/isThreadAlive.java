package com.test.thread;

/**
 * @author  判断线程是否启动
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
		System.out.println("线程启动前--》" + demo.isAlive());
		demo.start();
		System.out.println("线程启动后--》" + demo.isAlive());
		
	}

}
