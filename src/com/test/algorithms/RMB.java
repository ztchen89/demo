package com.test.algorithms;

/*
 * 题目：金额转换，阿拉伯数字的金额转换成中国传统的形式如：（￥1011）－>（一千零一拾一元整）输出。
 * 这是一道比较经典的编程题，在笔试面试经常会出现。
 * 下面的程序还是有点问题的。
 */
public class RMB
{
    public static String convert(int number) 
    {  
        char[] data={'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};  
        char[] units={'元','拾','佰','仟','万','拾','佰','仟','亿'};  

        StringBuffer sb=new StringBuffer();  
        
        int unit=0;  
        while(number != 0) 
        {  
            sb.insert(0, units[unit++]);  
            int n = number % 10;  
            sb.insert(0, data[n]);  
            number /= 10;  
        }  
        return sb.toString();  
    }  
      
    public static void main(String[] args) {  
        System.out.println(convert(1011));  
    } 
}
