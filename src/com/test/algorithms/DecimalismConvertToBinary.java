package com.test.algorithms;



/*
 * 该代码解决：求一个十进制的正整数的二进制中1的个数
 * Integer.toBinaryString(int)都已经做好了：将一个int范围的整数转换成二进制，并返回其字符串
 * 难点1：如何求负正数
 * 难点2：超过int的表示范围怎么办
 */
public class DecimalismConvertToBinary
{
	public static String convertToBinary(int num)
	{
		String s = Integer.toBinaryString(num);
		System.out.println(s);
		
		return s;
	}
	
//	public static int a(int i){
//        if(i==0||i==1) return i;
//        return i%2+a(i/2);
//
//	}
	
	/** 
	 * 快速计算二进制数中1的个数(Fast Bit Counting) 
	 * 该算法的思想如下： 
	 * 每次将该数与该数减一后的数值相与，从而将最右边的一位1消掉 
	 * 直到该数为0 
	 * 中间循环的次数即为其中1的个数 
	 * 例如给定"10100“，减一后为”10011",相与为"10000",这样就消掉最右边的1 
	 */  
    public static int getCount(int i) {  //注意：对负数没用          
        int n;  
        for(n=0; i > 0; n++) {  
            i &= (i - 1);  
        }         
        return n;   
    }  
	
	
	public static void main(String[] args)
	{
		String ss = DecimalismConvertToBinary.convertToBinary(15);
		
		//System.out.println(ss);
		
		int count = 0;
		char one = '1';
		char zero = '0';
		
		for(int i = 0; i < ss.length(); i++)
		{
			if(one == ss.charAt(i))
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		//System.out.println(DecimalismConvertToBinary.a(15));
	}
}
