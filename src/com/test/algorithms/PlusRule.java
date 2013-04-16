package com.test.algorithms;

public class PlusRule {

	/**
	 * 9X9乘法表
	 */
	public static void main(String[] args) {
		// 核心算法 
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j + "*" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}	
	}
}
