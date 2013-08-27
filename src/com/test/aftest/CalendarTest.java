package com.test.aftest;

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
//		System.out.println(cl.get(Calendar.YEAR) + "��" + cl.get(Calendar.MONDAY) + "��" + cl.get(Calendar.DAY_OF_MONTH) + "��");
//		cl.add(cl.DAY_OF_YEAR, 315);
//		System.out.println(cl.get(Calendar.YEAR) + "��" + cl.get(Calendar.MONDAY) + "��" + cl.get(Calendar.DAY_OF_MONTH) + "��");
//		
//		
//		SimpleDateFormat sp1 = new SimpleDateFormat("yyyy-MM-dd");
//		SimpleDateFormat sp2 = new SimpleDateFormat("yyyy��MM��dd");
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
		 * ��ʱ����
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
				//���������߳�
				this.cancel();
				
			}
		}
		,3000);
	}

}
