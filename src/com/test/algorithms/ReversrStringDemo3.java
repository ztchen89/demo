package com.test.algorithms;

import java.util.Stack;

public class ReversrStringDemo3 {

	/**
	 * �ַ�����ת����������ʹ��ջ�ķ�����ջ�Ǹ����Ƚ�����ķ�ʽ�������ݡ�
	 * �����˼�����Ҫ����Ȼ��������ѭ���������Ǵ�ѭ����ȫ������foreach������ջ�Ǹ��������ݽṹ��
	 * �к������ȳ����ص㡣�Ƚ���ѹ��ջ�ף������ѹ��ջ������ջʱ��ʹ�ջ����ʼ�Ƴ���
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
