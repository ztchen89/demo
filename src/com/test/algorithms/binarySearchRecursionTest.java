package com.test.algorithms;

public class binarySearchRecursionTest {
	
	public static int binarySearchRecursion(int[] a,int fromIndex,int toIndex,int key)
	{
		if(fromIndex > toIndex) return -1;
		int midIndex = (fromIndex + toIndex) / 2;
		int midVal = a[midIndex];
		
		if(midVal > key)
		{
			return binarySearchRecursion(a,fromIndex,midIndex - 1,key);
		}
		else if(midVal <key)
		{
			return binarySearchRecursion(a, midIndex + 1, toIndex, key);
		}
		else
		{
			return midIndex;
		}
		
	}

	public static void main(String[] args) {
		int[] a={1,3,4,5,8,7,9,11,15};  
		System.out.println(binarySearchRecursion(a,0,a.length,9));
		
		
	}
}



//public static int binarySearch(int[] a,int value)
//{
//	//若数组为空，则返回-1
//	if(a.length == 0 )
//	{
//		return -1;
//	}
//	
//	int low = 0;
//	int high = a.length - 1;
//	
//	while(low <= high)
//	{
//		int mid = (low + high) / 2;
//		
//		//打印中间元素选取过程，只是显示过程，与算法本身无关
//		for(int i = 0;i < a.length;i++)
//		{
//			System.out.print(a[i]);
//			if(i == mid)
//			{
//				System.out.print("#");//用#号表示中间元素
//			}
//			System.out.print(" ");//各个元素用空格隔开
//		}
//		System.out.println();//每次选取过程换行
//		
//		//核心
//		if(value == a[mid])
//		{
//			return mid;
//		}
//		else if(value > a[mid])
//		{
//			low = mid + 1;
//		}
//		else
//		{
//			high = mid - 1;
//		}
//	}
//	
//	return -1; //不存在该元素则返回-1   
//}