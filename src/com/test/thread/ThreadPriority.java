package com.test.thread;


/**
 * @author �̵߳����ȼ�
 * */
//�����벻Ҫ����Ϊ���ȼ�Խ�߾���ִ�С�˭��ִ�л���ȡ����˭��ȥ��CPU����Դ��
//���⣬���̵߳����ȼ���5.

public class ThreadPriority implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 5 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + "����" + i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadPriority(),"A");
		Thread t2 = new Thread(new ThreadPriority(),"B");
		Thread t3 = new Thread(new ThreadPriority(),"C");
		t1.setPriority(8);
		t2.setPriority(2);
		t3.setPriority(6);
		t1.start();
		t2.start();
		t3.start();

	}

}
