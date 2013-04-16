package com.test.designpatten;

public class SingletonTest 
{
	public static void main(String[] args) 
	{
//		Singleton singleton = Singleton.getInstance();
//		Singleton singleton1 = Singleton.getInstance();
//		
//		System.out.println(singleton == singleton1);
		new MyThread().start();
		new MyThread().start();
	}
}
class Singleton
{
//	private static Singleton singleton = new Singleton();
	//这种在多线程环境中会出现问题
	private static Singleton singleton = null;
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{	
		
		if(singleton == null)
		{
			//模拟CPU的切换
			try
			{
				Thread.sleep((long) (Math.random() * 3000));
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			singleton = new Singleton();
		}
		
		
		return singleton;
	}
}

class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Singleton.getInstance());
	}
}