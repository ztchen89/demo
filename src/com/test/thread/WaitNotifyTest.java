package com.test.thread;

public class WaitNotifyTest
{
	public static void main(String[] args)
	{
		Sample sample = new Sample();
		
		Thread inc1 = new IncreaseThread(sample);
		Thread dec1 = new DecreaseThread(sample);
		
		//线程一多就出错了，为什么呢？要思考
		Thread inc2 = new IncreaseThread(sample);
		Thread dec2 = new DecreaseThread(sample);
		
		inc1.start();
		dec1.start();
		
		inc2.start();
		dec2.start();
	}
}

class Sample
{
	private int num;
	
	//给num加1
	public synchronized void increase()
	{
		//这里若用if就会出错，想想为什么
		while(0 != num)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		num++;
		System.out.println(num);
		
		notify();
	}
	
	//给num减1
	public synchronized void decrease()
	{
		//这里若用if就会出错，想想为什么
		while(0 == num)
		{
			try
			{
				//每次被唤醒之后，都会去判断一下num是否等于0，如果用if只判断一次，那就会出错
				wait();
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		num--;
		System.out.println(num);
		
		notify();
	}
}

/*
 * 定义两个线程，分别做加1和减1操作
 */

class IncreaseThread extends Thread
{
	private Sample sample;
	
	public IncreaseThread(Sample sample)
	{
		this.sample = sample;
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i < 20; i++)
		{
			try
			{
				Thread.sleep((long) (Math.random() * 1000));
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			sample.increase();
		}
		
	
	}
}

class DecreaseThread extends Thread
{
	private Sample sample;
	
	public DecreaseThread(Sample sample)
	{
		this.sample = sample;
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i < 20; i++)
		{
			try
			{
				Thread.sleep((long) (Math.random() * 1000));
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			sample.decrease();
		}
		

	}
}





















