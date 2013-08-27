package com.test.algorithms;

/*
 * 任意给定一个32位无符号整数n，求n的二进制表示中1的个数，
 * 比如n = 5（0101）时，返回2，n = 15（1111）时，返回4
 */
public class BitCountTest
{
	public static int BitCount(int n)
	{
		int count = 0;//计数器
		
		while(n > 0)
		{
			if((n & 1) == 1) //当前位是1
				++count;	//计数器加1
			
			n >>= 1; //n移位 
		}
		
		return count;
	}
	
	/** 
	 * 快速计算二进制数中1的个数(Fast Bit Counting) 
	 * 该算法的思想如下： 
	 * 每次将该数与该数减一后的数值相与，从而将最右边的一位1消掉 
	 * 直到该数为0 
	 * 中间循环的次数即为其中1的个数 
	 * 例如给定"10100“，减一后为”10011",相与为"10000",这样就消掉最右边的1 
	 */  
    public static int getCount(int i) {          
        int n;  
        for(n=0; i > 0; n++) {  
            i &= (i - 1);  
        }         
        return n;         
    }  
	
	public static void main(String[] args)
	{
		System.out.println(BitCount(15));
		System.out.println(getCount(15));
	}
}
