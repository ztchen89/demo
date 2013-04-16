package com.test.thread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class ThreadRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread tt = new Thread(new testThread2());
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
		
		testThread2 tt1 = new testThread2();
		new Thread(tt1).start();
		try{Thread.sleep(1);}catch(Exception e){};
		tt1.str = new String("method");
		new Thread(tt1).start();

	}

}
class testThread2 implements Runnable
{
	int tickets = 100;
	String str = new String("");//¼àÊÓÆ÷
	@Override
	public void run()
	{
		if(str.equals("method"))
		{
			sale();			
		}
		else
		{
			synchronized(str)
			{
				while(tickets > 0)		
				{
					try 
					{
						Thread.sleep(100);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					synchronized(this){};
					System.out.println(Thread.currentThread().getName()+ " is selling ticket " + tickets--);	
				}
			}
		}

	}
	public synchronized void sale()
	{
		while(tickets > 0)
		{
			try 
			{
				Thread.sleep(10);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			synchronized(str){};
			System.out.print("sale(): ");
			System.out.println(Thread.currentThread().getName()+ " is selling ticket " + tickets--);
		}
	}
}
