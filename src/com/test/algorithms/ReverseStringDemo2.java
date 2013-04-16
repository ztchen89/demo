package com.test.algorithms;



public class ReverseStringDemo2 {

	/**
	 * 字符串反转程序例二:字符串：a b c d ,我们可以首尾依次对调，d b c a(一次)，d c b a(两次)。
	 * 所以可以看出，其实可以循环次数知识长度的一半就可以了！！其中首位依次对调，
	 * 这个就是我们平常常见的两个值怎样换值的问题，找个中间人
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		char []oldchar = str.toCharArray();
		int L = str.length();
		
		for(int i = 0;i<L/2;i++)
		{
			char middle;
			middle = oldchar[i];
			oldchar[i] = oldchar[L-i-1];
			oldchar[L-i-1] = middle;
		}
		System.out.print(oldchar);	

	}
}
