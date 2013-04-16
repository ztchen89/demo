package com.test.algorithms;

public class ReverseStringDemo1 {

	/**
	 * 字符串反转程序例一：把字符串拆分成字符数组，然后用遍历，来对数组进行反转的实现。
	 */
	public static void main(String[] args) {
	
		String s = "abcd";
		char []oldchar = s.toCharArray();
		int L = s.length();
		char []newchar = new char[L];
		for(int i = 0; i<L ; i++)
		{
			newchar[i] = oldchar[L-i-1];
		}
		System.out.print(newchar);

	}
}
