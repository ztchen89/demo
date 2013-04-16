package com.test.dynamicProxy;


//抽象角色(之前是抽象类，此处应改为接口)： 
public interface Subject 
{
	//接口中的方法都是抽象的，不写abstract也行
	abstract public void request();
}
