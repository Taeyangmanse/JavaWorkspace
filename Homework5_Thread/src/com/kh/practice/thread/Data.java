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
			if (!isEmpty)
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
			System.out.println("put value : " + value);
			
			notify();
			
		}
	}
	
	public int getValue()
	{
		synchronized (this)
		{
			if (isEmpty)
			{
				try
				{
					throw new EmptyException("현재 입력된 값이 없습니다. 기다리십시오...");
					
				} 
				catch (EmptyException e) 
				{
					String errMasage = e.getMessage();
					System.out.println(errMasage);
					try 
					{
						wait();
					} 
					catch (InterruptedException e1) 
					{
						e1.printStackTrace();
					}
				}				
			}
			
			isEmpty = true;
			System.out.println("value : " + value);
			
			notify();
			
			return value;
		}
	}
}
