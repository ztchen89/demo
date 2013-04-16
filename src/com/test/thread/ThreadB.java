package com.test.thread;
/** 
* 计算1+2+3 ... +100的和 
* 
* @author eric 2012-7.23
*/ 
public class ThreadB extends Thread{
	int total = 0;
	
	public void run()
	{
		synchronized(this)
		{
			for(int i = 0;i < 101; i++)
			{
				total += i;
			}
			//（完成计算了）唤醒在此对象监视器上等待的单个线程，在本例中线程A被唤醒 
			notify();
		}
	}

}
