package com.test.algorithms;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random();
		//����0-100�������
		int x = r.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ɣ�\n����������������1-100��");
		int m = 0; //����Ĵ���
		int y = sc.nextInt();
		
		while(true)
		{
			if(m == 10)
			{
				System.out.println("��̫���ˣ��´������ɣ�");
				break;
			}
			
			if(y > x)
			{
				System.out.println("���ˣ���Сһ�㣡\n���������룺");
				y = sc.nextInt();
				m++;
			}
			else if(y < x)
			{
				System.out.println("С�ˣ��ٴ�һ�㣡\n���������룺");
				y = sc.nextInt();
				m++;
			}
			else
			{
				System.out.println("��ϲ�㣡�¶��ˣ�");
				break;
			}
		}
	}
}
