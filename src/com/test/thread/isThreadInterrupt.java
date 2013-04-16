package com.test.thread;

/**
 * @author 线程的中断
 * */

public class isThreadInterrupt implements Runnable {

	@Override
	public void run() {
		
		System.out.println("执行run()方法");
		try 
		{
			Thread.sleep(10000);
			System.out.println("线程完成休眠！");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("线程休眠被打断！");
			return;
		}
		System.out.println("线程正常终止。");
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		isThreadInterrupt itt = new isThreadInterrupt();
		Thread demo = new Thread(itt);
		demo.start();
		
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		demo.interrupt();//2秒后中断线程
	}

}
