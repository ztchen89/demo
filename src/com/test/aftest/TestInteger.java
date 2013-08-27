package com.test.aftest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> v = new ArrayList<Integer>();
		v.add(new Integer(1));
		v.add(new Integer(3));
		v.add(new Integer(2));
		System.out.println(v.toString());
		
		Collections.sort(v);
		System.out.println(v.toString());
//		int b = 0;
//		while(true)
//		{
//			try 
//			{
//				b = System.in.read();
//				if(b == '\r' || b == '\n')
//					break;
//				else
//				{
//					int num = b - '0';
//					v.add(new Integer(num));
//				}
//			} 
//			catch (IOException e) 
//			{
//				e.printStackTrace();
//			}
//			int sum = 0;
//			Iterator e = v.iterator();
//			while(e.hasNext())
//			{
//				Integer intObj = (Integer)e.next();
//				sum += intObj.intValue();
//			}
//			System.out.println(sum);
//		}
//		Vector vv = new Vector();
//		vv.add(e)
	}
}
