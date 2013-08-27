package com.test.interview;

public class StringCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		String s2 = "java";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s = "ja";
		String s3 = s + "va";
		String s4 = "java";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
	}

}
