package com.test.thread;

public class PC_Consumer implements Runnable {
	
	private PC_Clerk clerk;
	
	public PC_Consumer(PC_Clerk clerk)
	{
		this.clerk = clerk;
	}

	@Override
	public void run() {
		System.out.println("�����߿�ʼ���Ѳ�Ʒ....");
		
		for(int i = 1; i <= 10 ;i++)
		{
			try 
			{
				//�ȴ����ʱ��
				Thread.sleep((long) (Math.random()*3000));
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//�ӵ�Ա��ȡ������
			clerk.getProduct();
		}
	}
}
