package com.test.aftest;

public class Puzzler_Pet
{
	public final String name;
	public final String food;
	public final String sound;
	
	public Puzzler_Pet(String name, String food, String sound)
	{
		super();
		this.name = name;
		this.food = food;
		this.sound = sound;
	}
	
	public void eat()
	{
		System.out.println(name + ": Mmmmmm" + food);
	}
	
	public void play()
	{
		System.out.println(name + ": sound" + sound);
	}
	
	public void sleep()
	{
		System.out.println(name + ": zzzzz");
	}
	
	public void live()
	{
		new Thread(){
			@Override
			public void run()
			{
				while(true)
				{
					eat();
					play();
					//sleep(); 原来错误的一行
					Puzzler_Pet.this.sleep();//修改方法一
				}
			}
		}.start();
		
		/*
		 * 修改方法二
		 * 因为匿名内部类不会再继承Thread.sleep()方法
		new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				while(true)
				{
					eat();
					play();
					//sleep(); 原来错误的一行
					sleep();//修改方法二
				}
			}
		}).start();
		*/
	}
	
	public static void main(String[] args)
	{
		new Puzzler_Pet("eric", "pie", "fuck").live();
	}
	
}
