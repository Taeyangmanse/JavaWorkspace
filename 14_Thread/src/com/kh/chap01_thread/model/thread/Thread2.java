package com.kh.chap01_thread.model.thread;

public class Thread2 implements Runnable
{

	@Override
	public void run() 
	{
		for (int i = 1; i <= 100; i++)
		{
			System.out.println(String.format("2번 스레드 [ %d ]", i));
		}
	}
	
}
