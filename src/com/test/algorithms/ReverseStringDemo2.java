package com.test.algorithms;



public class ReverseStringDemo2 {

	/**
	 * �ַ�����ת��������:�ַ�����a b c d ,���ǿ�����β���ζԵ���d b c a(һ��)��d c b a(����)��
	 * ���Կ��Կ�������ʵ����ѭ������֪ʶ���ȵ�һ��Ϳ����ˣ���������λ���ζԵ���
	 * �����������ƽ������������ֵ������ֵ�����⣬�Ҹ��м���
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
