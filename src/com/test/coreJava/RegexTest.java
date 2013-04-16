package com.test.coreJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexTest {

	/**
	 * @提示输入一个模式，然后提示输入用于匹配的字符串，随后打印出输入是否与模式相匹配
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Eenter pattern: ");
		String patternString = in.nextLine();
		
		Pattern pattern = null;
		try
		{
			//comlile方法把正则表达式字符串变编译到一个用于快速处理匹配的模式对象中
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
			//核心代码qq
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
