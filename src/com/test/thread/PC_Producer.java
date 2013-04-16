package com.test.thread;

/*
 * ���a�ߕ����a10�������������M�ߕ�����10��������
 * ��춵�Tֻ̎�ܷ���һ������������ÿ���aһ��������һ������Y��������ʾ�ǟo�`�ġ�
 */
public class PC_Producer implements Runnable{
	
	private PC_Clerk clerk;
	
	public PC_Producer(PC_Clerk clerk)
	{
		this.clerk = clerk;
	}

	@Override
	public void run() {
		System.out.println("�����߿�ʼ��������.....");
		
		//����1��10������
		for(int product = 1; product <= 10; product++)
		{
			try 
			{
				//��ͣ���ʱ��
				Thread.sleep((long) (Math.random()*3000));
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//����Ʒ������Ա
			clerk.setProduct(product);
		}		
	}
}
