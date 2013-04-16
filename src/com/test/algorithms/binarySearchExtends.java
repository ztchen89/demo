package com.test.algorithms;


/**
 * 题目：有一类数组，例如数组[1,2,3,4,6,8,9,4,8,11,18,19,100] 
 * 前半部分是是一个递增数组，后面一个还是递增数组，但整个数组不是递增数组，那么怎么最快的找出其中一个数？
 * 分析：此题数组不是严格递增的数据，因为有重复的元素。对数组的前半部分和后半部分分别进行二分查找。
 */

public class binarySearchExtends {
	
	//二分查找
	public static int binarySearch(int[] a,int fromIndex,int toIndex,int key)
	{
		if(a.length == 0 )
			return -1;
		int low = fromIndex;
		int high = toIndex - 1;
		
		while(low <= high)
		{
			int mid = (low + high) >>> 1;
			int midVal = a[mid];
			
			
			if(key == midVal)
			{
				return mid;
			}
			else if(key < midVal)
			{
				high = mid -1;
			}
			else
			{
				low = mid + 1;
			}
		}
		return -1;
	}

	public static int search(int[] a,int value)
	{
		int i,index;
		
		for(i = 0 ;i < a.length - 1;i++)
		{
			if(a[i] > a[i+1])  //找到前后两个数组的分界点i
				break;
		}
		
		if(a[i] >= value)   //对前面数组进行二分查找
		{
			index = binarySearch(a, 0, i, value);
			return index;
		}
		if(a[i] <= value)  //对后面数组进行二分查找
		{
			index = binarySearch(a, i+1, a.length-1, value);
			return index;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int a[]={1,2,3,4,6,8,9,4,8,11,18,19,100};
		System.out.println(search(a, 4));
	}
}
