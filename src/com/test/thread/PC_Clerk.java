package com.test.thread;

public class PC_Clerk {
	//-1 ��ʾĿǰû�в�Ʒ
	private int product = -1;
	
	//�÷����������ߵ���
	public synchronized void setProduct(int product)
	{
		while(this.product != -1)
		{
			try {
				//Ŀǰ��Աû�пռ�Ų�Ʒ�����Ժ�
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.product = product;
		System.out.printf("�������趨 (%d)%n",this.product);
		//֪ͨ�ȴ����е�һ�������߿��Լ���������
		notify();
	}
	
	//�÷����������ߵ���
	public synchronized int getProduct()
	{
		while(this.product == -1)
		{
			try {
				//ȱ���ˣ����Ժ�
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int p = this.product;
		System.out.printf("������ȡ��  (%d)%n",this.product);
		//ȡ�ߺ󣬽�ְԱ�ǲ�Ʒ���
		this.product = -1;
		//֪ͨ�ȴ�����һ�������߿��Լ���������Ʒ
		notify();
		
		return p;
	}
}
