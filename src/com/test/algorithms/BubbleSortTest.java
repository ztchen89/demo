package com.test.algorithms;

public class BubbleSortTest {

	//下面对上面的冒泡排序进行优化，设置一个标志，如果这一趟发生了交换，则为true，
	//否则为false。明显如果有一趟没有发生交换，说明排序已经完成。
	public static void BubbleSort(int[] a)
	{
		boolean flag = true;
		while(flag)
		{
			flag = false;
			for(int i = 0; i < a.length - 1; i++)
			{
				for(int j = 0; j < a.length - i - 1; j++)
				{
					if(a[j] > a[j+1])
					{
						int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
						flag = true;
					}
				}
				
				if(!flag) break;
			}
		}

	}
	
	public static void printArray(int[] a)
	{
		for(int i = 0;i < a.length-1;i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] b = {1,2,3,4,5,6};
 		BubbleSort(b);
 		printArray(b);
 		
	}
}
