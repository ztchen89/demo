package com.test.thread;

public class DeadlockRisk {
	private static class Resource
	{
		public int value;
	}
	
	private Resource resourceA = new Resource();
	private Resource resourceB = new Resource();
	
	public int read()
	{
		synchronized(resourceA)
		{
			synchronized(resourceB)
			{
				return resourceB.value + resourceA.value;
			}
		}
	}
	
	public void write(int a,int b)
	{
		synchronized(resourceB)
		{
			synchronized(resourceA)
			{
				resourceA.value = a;
				resourceB.value = b;
			}
		}
	}

}
