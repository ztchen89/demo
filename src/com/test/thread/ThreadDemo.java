package com.test.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		//new Thread().start();
//		Thread tt=new testThread();
//		tt.setDaemon(true);
//		tt.start();
//		int index = 0;
//		while(true)
//		{
//			if(index++ == 100)
//			{	try 
//				{
//					tt.join(10000);
//				} 
//				catch (InterruptedException e) 
//				{
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			System.out.println("main():"+Thread.currentThread().getName());
//		}
//		new testThread().start();
//		new testThread().start();
//		new testThread().start();
		testThread tt = new testThread();
		tt.start();
//		tt.start();
//		tt.start();
//		tt.start();

	}
}
class testThread extends Thread
{
	
	int tickets = 100;
	@Override
	public void run()
	{
		while(tickets > 0)
		{
		
			System.out.println(Thread.currentThread().getName() + " is selling ticket  " + tickets--);
		}
	}
}