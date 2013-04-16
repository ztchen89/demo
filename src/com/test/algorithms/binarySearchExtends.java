package com.test.algorithms;


/**
 * ��Ŀ����һ�����飬��������[1,2,3,4,6,8,9,4,8,11,18,19,100] 
 * ǰ�벿������һ���������飬����һ�����ǵ������飬���������鲻�ǵ������飬��ô��ô�����ҳ�����һ������
 * �������������鲻���ϸ���������ݣ���Ϊ���ظ���Ԫ�ء��������ǰ�벿�ֺͺ�벿�ֱַ���ж��ֲ��ҡ�
 */

public class binarySearchExtends {
	
	//���ֲ���
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
			if(a[i] > a[i+1])  //�ҵ�ǰ����������ķֽ��i
				break;
		}
		
		if(a[i] >= value)   //��ǰ��������ж��ֲ���
		{
			index = binarySearch(a, 0, i, value);
			return index;
		}
		if(a[i] <= value)  //�Ժ���������ж��ֲ���
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
