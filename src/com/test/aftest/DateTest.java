package com.test.aftest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest
{
	public static void main(String[] args)
	{
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(dateformat.format(new Date()));
	}
}
