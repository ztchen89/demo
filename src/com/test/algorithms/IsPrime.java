package com.test.algorithms;

/*
 * 算法复杂度几乎是O(n*log(n))
 */
public class IsPrime
{
	public static boolean isPrime(int num)
	{
		for(int i = 2; i <= Math.sqrt(num);i++)
		{
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isPrime2(int num)
	{
		if(num == 2)
		{
			return true;
		}
		else if(num > 2)
		{
			if(num % 2 ==0)
			{
				return false;
			}
			else
			{
				for(int i = 3; i <= Math.sqrt(num); i++)
				{
					if(num % i == 0)
						return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean isPrime3(int num)
	{
		int max = (int) Math.sqrt(num);
		int i = 2;
		
		while(i <= max)
		{
			if(num % i ==0)
				return false;
			
			i++;
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		int num = 53;
		int count = 0;
		      
		for(int i = 2; i <= num; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
				count++;
			}
		}
		
		System.out.println("总共有" + count + "个素数");
		
//		System.out.println(isPrime(53));
		
	}
}
