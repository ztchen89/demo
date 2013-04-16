package com.test.algorithms;

public class Palindrome {

	/**
	 * 回文算法的简单Java实现
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcdba";
		String str2 = new StringBuffer(str1).reverse().toString();
		
//		String s = "w2YFY7QQf6z3COflpWvS6TlJCTO?/ziuq/moc.oaboat.deu//:ptth";
//		String s1 = new StringBuffer(s).reverse().toString();
//		System.out.print(s1);
		if(str1.equals(str2))
		{
			System.out.print("是回文");
		}
		else
		{
			System.out.print("不是回文");
		}
	}

}
