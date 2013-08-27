package com.test.aftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GetGoogleHeaderInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("��ȡ����ҳ��");
		getContentByLanguage("ja");
		System.out.println("\n");
		
		System.out.println("��ȡ����ҳ��");
		getContentByLanguage("zh-cn");

	}
	
	public static void getContentByLanguage(String country)
	{
		try 
		{
			URL urlGoogle = new URL("http://www.google.com.cn");
			HttpURLConnection googleConnection = (HttpURLConnection) urlGoogle.openConnection();
			googleConnection.setRequestProperty("Accept-Language",country);

			
			Map<String, List<String>> request = googleConnection.getRequestProperties();
			Set reqFileds = request.keySet();
			Iterator itrReq = reqFileds.iterator();
			while(itrReq.hasNext())
			{
				String field = (String) itrReq.next();
				System.out.println(field + ":" + googleConnection.getRequestProperty(field));
			}
		//	googleConnection.connect();
			Map<String, List<String>> respose = googleConnection.getHeaderFields();
			Set resFileds = respose.keySet();
			Iterator itrRes = resFileds.iterator();
			while(itrRes.hasNext())
			{
				String field = (String) itrRes.next();
				System.out.println(field + ":" + googleConnection.getHeaderField(field));
			}
			
			InputStream in = googleConnection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine = null;
			while((strLine = br.readLine()) != null)
			{
				System.out.println(strLine);
			}
			br.close();
			googleConnection.disconnect();
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}
}
