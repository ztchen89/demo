package com.test.thread;

public class newThread implements Runnable {
	private int count = 5;
	
	@Override
	public void run() {
		
		for(int i = 0; i < 7; i++)
		{
			if(count > 0)
			{
				System.out.println("count = " + count--);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		newThread nt = new newThread();
		new Thread(nt).start();
	}

}
