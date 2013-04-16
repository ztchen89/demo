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
//	//������Ϊ�գ��򷵻�-1
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
//		//��ӡ�м�Ԫ��ѡȡ���̣�ֻ����ʾ���̣����㷨�����޹�
//		for(int i = 0;i < a.length;i++)
//		{
//			System.out.print(a[i]);
//			if(i == mid)
//			{
//				System.out.print("#");//��#�ű�ʾ�м�Ԫ��
//			}
//			System.out.print(" ");//����Ԫ���ÿո����
//		}
//		System.out.println();//ÿ��ѡȡ���̻���
//		
//		//����
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
//	return -1; //�����ڸ�Ԫ���򷵻�-1   
//}