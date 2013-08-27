package com.test.aftest;

public class Puzzlers_Twisted
{
	private final String name;
	
	public Puzzlers_Twisted(String name)
	{
		this.name = name;
	}
	
	private String name()
	{
		return name;
	}
	
	private void reproduce()
	{
		//原因：私有成员不会被继承
		//name方法并没有被继承到reproduce方法中的匿名类。
		//所以匿名类中对于printName方法的调用必须关联到外围("main")实例
		//而不是当前("reproduce")实例
		new Puzzlers_Twisted("reproduce"){
			//在匿名内部类中声明一个方法
			void printName(){
				System.out.println(name());
			}
		}.printName();
	}
	
	public static void main(String[] args)
	{
		new Puzzlers_Twisted("main").reproduce();
	}
}

