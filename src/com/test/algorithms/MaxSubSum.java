package com.test.algorithms;

/*
 * 求一个数组的最大字段和
 */
public class MaxSubSum
{
	/*
	 * 复杂度O(n^3)
	 */
	public static int maxSubSum(int[] a)
	{
		int maxSum = 0;
		
		for(int i = 0; i < a.length; i++)
			for(int j = i; j < a.length; j++)
			{
				int thisSum = 0;
				
				for(int k = i; k <= j; k++)
					thisSum += a[k];
				
				if(thisSum > maxSum)
					maxSum = thisSum;
			}
		
		
		return maxSum;
	}
	
	/*
	 * 复杂度O(n^2)
	 */
	public static int maxSubSum2(int[] a)
	{
		int maxSum = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			int thisSum = 0;
			for(int j = i; j < a.length; j++)
			{
				thisSum += a[j];
				
				if(thisSum > maxSum)
					maxSum = thisSum;
				
			}
		}
		
		return maxSum;
	}
	
	public static void main(String[] args)
	{
		int[] a = {2,2,3,-1};
		
		System.out.println(MaxSubSum.maxSubSum2(a));
		
	}
}
