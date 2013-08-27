package com.test.algorithms;

/**************【Fibonacci数列】*************************
题目：古典问题：有一对兔子，从出生后第3个月起每个月都生
一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如
兔子都不死，问每个月的兔子总对数为多少？ 
程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....(Fibonacci数列)
*******************************************************/
public class Fibonacci
{
	
	//兔子对数的Fibonacci的递归方法
	public static int fib(int n)
	{
		if(n == 0 || n == 1)
		{
			return 1;
		}
		else 
		{
			return fib(n - 1) + fib(n - 2);
		}
	}
	
	//效率很低，包含大量的重复计算，
	//如：计算f(n)需要计算f(n-1)，f(n-2)。计算f(n-1)时又要计算一遍f(n-2)
	// 时间复杂度为o(n^2)
	public static int fib1(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n == 1)
		{
			return 1;
		}
		else
		{
			return fib1(n - 1) + fib1(n - 2);
		}
	}
	
	/*
	 * 在计算f(n)时我们只需要 f(n-1), f(n-2)，
	 * 数组index在n-2之前的元素已经没有存在的必要。
	 * 其实使用两个变量来保存需要计算出f(n)的前两个元素即可.
	 * 时间复杂度为o(n),空间复杂度O(1)
	 */
	public static int fib2(int n)
	{
		int n1 = 0, n2 = 1;
		int temp = 0;
		
		for(int i = 1; i < n; i++)
		{
			temp = n1;
			n1 = n2;
			n2 += temp;
			System.out.println("temp=" + temp + " n1=" + n1 + " n2=" + n2);
		}
		
		return n2;
	}
	
    public static void main(String args[])
    {
    	int n = 45;
    	System.out.println(fib1(n));
    	System.out.println(fib2(n));
    	
    	//兔子对数的输出
//        long num1,num2;
//        short i;
//        num1 = num2 = 1;
//        
//        for(i=1; i<12; i++)
//        {
//            System.out.println("第"+i+"个月："+num1+"对。");
//            i++;
//            System.out.println("第"+i+"个月："+num2+"对。");  
//            num1 = num1 + num2; 
//            num2 = num2 + num1;
    }
}
