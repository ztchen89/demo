package com.test.thread;

/*
 * 生產者會生產10個整數，而消費者會消耗10個整數，
 * 由於店員處只能放置一個整數，所以每生產一個就消耗一個，其結果如上所示是無誤的。
 */
public class PC_Producer implements Runnable{
	
	private PC_Clerk clerk;
	
	public PC_Producer(PC_Clerk clerk)
	{
		this.clerk = clerk;
	}

	@Override
	public void run() {
		System.out.println("生产者开始生产整数.....");
		
		//生产1到10的整数
		for(int product = 1; product <= 10; product++)
		{
			try 
			{
				//暂停随机时间
				Thread.sleep((long) (Math.random()*3000));
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//将产品交给店员
			clerk.setProduct(product);
		}		
	}
}
