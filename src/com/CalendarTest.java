package com;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class CalendarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Calendar cl = Calendar.getInstance();
//		System.out.println(cl.get(Calendar.YEAR) + "年" + cl.get(Calendar.MONDAY) + "月" + cl.get(Calendar.DAY_OF_MONTH) + "日");
//		cl.add(cl.DAY_OF_YEAR, 315);
//		System.out.println(cl.get(Calendar.YEAR) + "年" + cl.get(Calendar.MONDAY) + "月" + cl.get(Calendar.DAY_OF_MONTH) + "日");
//		
//		
//		SimpleDateFormat sp1 = new SimpleDateFormat("yyyy-MM-dd");
//		SimpleDateFormat sp2 = new SimpleDateFormat("yyyy年MM月dd");
//
//		try 
//		{
//			Date date = sp1.parse("2012-9-10");
//			System.out.println(sp2.format(date));
//		}
//		catch (ParseException e) 
//		{
//			e.printStackTrace();
//		}
		File f = new File("count.txt");
		f.delete();
		/*
		 * 定时任务
		 */
		new Timer().schedule(new TimerTask()
		{
			public void run()
			{
				try 
				{
					Runtime.getRuntime().exec("calc.exe");
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				//结束任务线程
				this.cancel();
				
			}
		}
		,3000);
	}

}
