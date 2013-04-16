package com.test.coreJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexTest {

	/**
	 * @��ʾ����һ��ģʽ��Ȼ����ʾ��������ƥ����ַ���������ӡ�������Ƿ���ģʽ��ƥ��
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Eenter pattern: ");
		String patternString = in.nextLine();
		
		Pattern pattern = null;
		try
		{
			//comlile������������ʽ�ַ�������뵽һ�����ڿ��ٴ���ƥ���ģʽ������
			pattern = Pattern.compile(patternString);
		}
		catch(PatternSyntaxException e)
		{
			System.out.println("Pattern syntax error ");
			System.exit(1);
		}
		
		while(true)
		{
			System.out.println("Enter string to match: ");
			String input = in.nextLine();
			if(input == null || input.equals("")) return;
			Matcher matcher = pattern.matcher(input);
			//���Ĵ���qq
			if(matcher.matches())
			{
				System.out.println("Match");
				int g = matcher.groupCount();
				if(g > 0)
				{
					for(int i = 0; i < input.length(); i++)
					{
						for(int j = 1; j <= g; j++)
							if(i == matcher.start(j))
								System.out.print('(');
						System.out.print(input.charAt(i));
						for(int j = 1; j < g; j++)
							if(j + 1 == matcher.end(j));
								System.out.print(')');
					}
					System.out.println();
				}
			}
			else
				System.out.println("No Match");
		}
	}

}
