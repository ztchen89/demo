package com.test.algorithms;

public class Pyramids {

	public static void main(String[] args) {
		//��������
		int lay=5; //��ʾ�ж��ٲ� 
		for(int i=1;i<=lay;i++)
		{
			for(int k=1;k<=lay-i;k++) //�ҳ��ո����
			{
				System.out.print(" ");
			}

			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println(); //���һ������ 
		}		
		//��������
		int lay1=5; //��ʾ�ж��ٲ� 
		for(int i=lay1;i>=1;i--)
		{
			for(int k=1;k<=lay1-i;k++) //�ҳ��ո����
			{
				System.out.print(" ");
			}

			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println(); //���һ������ 
		}	
	}
}
