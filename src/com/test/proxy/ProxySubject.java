package com.test.proxy;

//代理角色
public class ProxySubject extends Subject 
{
	private RealSubject realSubject; //以真实对象作为代理对象的属性
	
	public ProxySubject()
	{
	}
	
	@Override
	public void request() //该方法封装了真实对象的request方法 
	{
		preRequest();
		
		if(realSubject == null)
		{
			realSubject = new RealSubject();
		}
		
		realSubject.request(); //此处执真实对象的request方法
		
		postRequest();
	}

	private void postRequest() {
		// TODO Auto-generated method stub
		
	}

	private void preRequest() {
		// TODO Auto-generated method stub
		
	}
}
