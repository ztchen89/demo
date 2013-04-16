package com.test.thread;

public class PC_Clerk {
	//-1 表示目前没有产品
	private int product = -1;
	
	//该方法由生产者调用
	public synchronized void setProduct(int product)
	{
		while(this.product != -1)
		{
			try {
				//目前店员没有空间放产品，请稍后
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.product = product;
		System.out.printf("生产者设定 (%d)%n",this.product);
		//通知等待区中的一个消费者可以继续工作了
		notify();
	}
	
	//该方法由消费者调用
	public synchronized int getProduct()
	{
		while(this.product == -1)
		{
			try {
				//缺货了，请稍后
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int p = this.product;
		System.out.printf("消费者取走  (%d)%n",this.product);
		//取走后，将职员那产品清空
		this.product = -1;
		//通知等待区的一个生产者可以继续生产产品
		notify();
		
		return p;
	}
}
