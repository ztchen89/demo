package com.test.algorithms;


/*
 * 求最大公因数的欧几里得算法
 */
public class Gcd
{
	/*
	 * 方法一：对于大整数而言，取模运算是非常昂贵的开销，将成为整个算法的瓶颈。
	 */
	public static int gcd(int m, int n)
	{
		int temp;
		
//		if(m < n)
//			return gcd(n, m);
		
		//大数赋m，小数赋n
		if(m < n)
		{
			temp = m;
			m = n;
			n = temp;
		}
		
		while(n != 0)
		{
			int rem = m % n;
			m = n;
			n = rem;
		}
		
		return m;
	}
	
	/*
	 * 方法二：m和n的公约数与m-n和n的公约数是相同，即gcd(m,n) == gcd(m - n,n)
	 * 该方法虽然将大整数的除法运算转换成减法算法，降低了计算的复杂度
	 * 但它的问题在于减法的迭代次数太多
	 */
	public static int gcd2(int m, int n)
	{
		if(m < n)
			return gcd2(n, m);
		
		if(n == 0)
		{
			return m;
		}
		else 
		{
			return gcd2(m - n, n);
		}
	}
	
	/*
	 * 方法三：结合上面两个方法
	 */
	public static int gcd3(int m, int n)
	{
		if(m < n)
			return gcd3(n, m);
		
		if(n == 0)
		{
			return m;
		}
		else 
		{
			if(isEven(m))
			{
				if(isEven(n))
					return (gcd3(m >> 1, n >> 1) << 1);
				else 
				{
					return gcd3(m >> 1, n);
				}
			}
			else 
			{
				if(isEven(n))
					return gcd3(m, n >> 1);
				else 
				{
					return gcd3(n, m - n);
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		int num = gcd3(10,11);
		System.out.println(num);
	}
	
	public static boolean isEven(int i )
	{
		return i % 2 == 0;
	}
}
