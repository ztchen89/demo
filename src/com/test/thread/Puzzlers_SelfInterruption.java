package com.test.thread;

public class Puzzlers_SelfInterruption
{
	public static void main(String[] args)
	{
		Thread.currentThread().interrupt();
		
		//Thread.interrupted()方法第一次调用的时候返回true，
		//并清除了线程的中断状态，所以在第二次调用该方法的时候返回的是false.
		if(Thread.interrupted())
		{
			System.out.println("YES: " + Thread.interrupted());
		}
		else {
			System.out.println("not: " + Thread.interrupted());
		}
		
		//Thread.isInterrupted()方法也是查询一个线程的中断状态，
		//但是它不会清除线程的中断状态。
		if(Thread.currentThread().isInterrupted())
		{
			System.out.println("YES: " + Thread.currentThread().isInterrupted());
		}
		else {
			System.out.println("not: " + Thread.currentThread().isInterrupted());
		}
	}
}
