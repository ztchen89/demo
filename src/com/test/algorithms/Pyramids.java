package com.test.algorithms;

public class Pyramids {

	public static void main(String[] args) {
		//正金字塔
		int lay=5; //表示有多少层 
		for(int i=1;i<=lay;i++)
		{
			for(int k=1;k<=lay-i;k++) //找出空格规律
			{
				System.out.print(" ");
			}

			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println(); //打出一个换行 
		}		
		//倒金字塔
		int lay1=5; //表示有多少层 
		for(int i=lay1;i>=1;i--)
		{
			for(int k=1;k<=lay1-i;k++) //找出空格规律
			{
				System.out.print(" ");
			}

			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println(); //打出一个换行 
		}	
	}
}
