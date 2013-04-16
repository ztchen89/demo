package com.test.algorithms;

import java.util.Stack;

public class ReversrStringDemo3 {

	/**
	 * 字符串反转程序例三：使用栈的方法。栈是根据先进后出的方式处理数据。
	 * 这个的思想很重要，虽然用来两次循环，上面那次循环完全可以用foreach遍历。栈是个线性数据结构，
	 * 有后进后进先出的特点。先进的压入栈底，后进的压入栈顶，出栈时候就从栈顶开始移出。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> sta = new Stack<Character>();
		String str = "abcd";
		int L = str.length();
		char []oldchar = str.toCharArray();
		for(int i = 0;i < L;i++)
		{
			sta.push(oldchar[i]);
		}
		char []newchar = new char[L];
		for(int j=0;j<L;j++)
		{
			newchar[j] = sta.pop();
			//System.out.print(sta.pop()) ;
		}
		System.out.print(newchar);
	}
}
