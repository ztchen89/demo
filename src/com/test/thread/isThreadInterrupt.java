package com.test.thread;

/**
 * @author �̵߳��ж�
 * */

public class isThreadInterrupt implements Runnable {

	@Override
	public void run() {
		
		System.out.println("ִ��run()����");
		try 
		{
			Thread.sleep(10000);
			System.out.println("�߳�������ߣ�");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("�߳����߱���ϣ�");
			return;
		}
		System.out.println("�߳�������ֹ��");
		
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
		demo.interrupt();//2����ж��߳�
	}

}
