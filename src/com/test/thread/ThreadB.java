package com.test.thread;
/** 
* ����1+2+3 ... +100�ĺ� 
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
			//����ɼ����ˣ������ڴ˶���������ϵȴ��ĵ����̣߳��ڱ������߳�A������ 
			notify();
		}
	}

}
