package com.test.algorithms;


public class binarySearchTest {
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
	
	public static void main(String[] args) {
		int[] a={1,3,4,5,8,7,9,11,15};  
		System.out.println(binarySearch(a,0,a.length,9));
	}
}
