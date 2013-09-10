package com.test.algorithms;

public class charAppearOnce {
	
	public static char FindFirstNotRepeat(String str)
	{
		int[] hash = new int[256];
		
		for (int i = 0; i < hash.length; i++) 
		{
			hash[i] = 0;
		}
		
		//不要疑惑，因为char和int可以相互转换，将char赋值给一个int，这个int就是该char的ASCII码的值
		for (int i = 0; i < str.length(); i++) 
		{
			int asciiNum = str.charAt(i);//加这行容易理解
			//System.out.println(asciiNum);
			hash[asciiNum]++;
			//System.out.println("i=" + i + " " + hash[str.charAt(i)]);
		}
		
		
		for (int i = 0; i < str.length(); i++) 
		{
			if(hash[str.charAt(i)] == 1)
				return str.charAt(i);
		}
		
		
		return ' ';
	}
	
	public static void main(String[] args) {
		String str = "cacdde";
//		char c = '9';
//		int a = c-48;
//		System.out.println(a);
		//System.out.println(97 == str.charAt(1));
		System.out.println(FindFirstNotRepeat(str));
	}
}
