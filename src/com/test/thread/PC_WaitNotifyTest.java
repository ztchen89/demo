package com.test.thread;



public abstract class PC_WaitNotifyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PC_Clerk clerk = new PC_Clerk();
		
		Thread producerThread = new Thread(new PC_Producer(clerk));
		Thread consumerThread = new Thread(new PC_Consumer(clerk));
		
		producerThread.start();
		consumerThread.start();


	}

}
