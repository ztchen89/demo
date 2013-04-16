package com.test.io;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderTest
{
	public static void main(String[] args) throws IOException
	{
		String str = "sadasdas";
		
		char[] ch = new char[str.length()];
		
		str.getChars(0, str.length(), ch, 0);
		
		CharArrayReader in = new CharArrayReader(ch);
		
		int i;
		
		while(-1 != (i = in.read()))
		{
			System.out.println((char)i);
		}
	}
}
