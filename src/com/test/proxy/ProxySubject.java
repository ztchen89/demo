package com.test.proxy;

//�����ɫ
public class ProxySubject extends Subject 
{
	private RealSubject realSubject; //����ʵ������Ϊ������������
	
	public ProxySubject()
	{
	}
	
	@Override
	public void request() //�÷�����װ����ʵ�����request���� 
	{
		preRequest();
		
		if(realSubject == null)
		{
			realSubject = new RealSubject();
		}
		
		realSubject.request(); //�˴�ִ��ʵ�����request����
		
		postRequest();
	}

	private void postRequest() {
		// TODO Auto-generated method stub
		
	}

	private void preRequest() {
		// TODO Auto-generated method stub
		
	}
}
