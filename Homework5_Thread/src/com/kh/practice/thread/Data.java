package com.kh.practice.thread;

public class Data 
{
	
	private int value;
	private boolean isEmpty = true;
	
	
	public Data()
	{
		
	}
	
	public void setValue(int value)
	{
		synchronized (this)
		{
			if (isEmpty)
			{
				try 
				{
					wait();
				}
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
			
			isEmpty = false;
			this.value = value;
			
			notify();
			
		}
	}
	
	public int getValue()
	{
		synchronized (this)
		{
			if (isEmpty == false)
			{
				try
				{
					wait();
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
			
			isEmpty = true;
			
			notify();
			
			return value;
		}
	}
}
