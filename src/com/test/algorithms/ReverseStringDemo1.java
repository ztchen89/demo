package com.test.algorithms;

public class ReverseStringDemo1 {

	/**
	 * �ַ�����ת������һ�����ַ�����ֳ��ַ����飬Ȼ���ñ���������������з�ת��ʵ�֡�
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
