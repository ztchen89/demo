package com.test.thread;

public class PC_Consumer implements Runnable {
	
	private PC_Clerk clerk;
	
	public PC_Consumer(PC_Clerk clerk)
	{
		this.clerk = clerk;
	}

	@Override
	public void run() {
		System.out.println("消费者开始消费产品....");
		
		for(int i = 1; i <= 10 ;i++)
		{
			try 
			{
				//等待随机时间
				Thread.sleep((long) (Math.random()*3000));
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//从店员那取走整数
			clerk.getProduct();
		}
	}
}
