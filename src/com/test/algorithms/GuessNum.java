package com.test.algorithms;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random();
		//生产0-100的随机数
		int x = r.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("随机数已生成！\n请输入你猜想的数（1-100）");
		int m = 0; //猜想的次数
		int y = sc.nextInt();
		
		while(true)
		{
			if(m == 10)
			{
				System.out.println("你太笨了，下次再来吧！");
				break;
			}
			
			if(y > x)
			{
				System.out.println("大了！再小一点！\n请重新输入：");
				y = sc.nextInt();
				m++;
			}
			else if(y < x)
			{
				System.out.println("小了！再大一点！\n请重新输入：");
				y = sc.nextInt();
				m++;
			}
			else
			{
				System.out.println("恭喜你！猜对了！");
				break;
			}
		}
	}
}
