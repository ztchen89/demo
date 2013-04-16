package com.test.thread;


/**
 * @author 线程的优先级
 * */
//但是请不要误以为优先级越高就先执行。谁先执行还是取决于谁先去的CPU的资源、
//另外，主线程的优先级是5.

public class ThreadPriority implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 5 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + "运行" + i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadPriority(),"A");
		Thread t2 = new Thread(new ThreadPriority(),"B");
		Thread t3 = new Thread(new ThreadPriority(),"C");
		t1.setPriority(8);
		t2.setPriority(2);
		t3.setPriority(6);
		t1.start();
		t2.start();
		t3.start();

	}

}
