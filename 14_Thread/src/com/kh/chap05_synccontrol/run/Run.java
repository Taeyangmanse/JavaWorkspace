package com.kh.chap05_synccontrol.run;

import com.kh.chap05_synccontrol.model.thread.*;

public class Run 
{
	public static void main(String[] args) 
	{
		
		Data data = new Data();
		
		Thread provider = new Thread(new Provider(data));
		Thread consumer = new Thread(new Consumer(data));
		
		
		provider.start();
		consumer.start();
		
	}
}
