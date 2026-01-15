package com.kh.practice.thread;

public class MultiThreadTest 
{
	public static void main(String[] args) 
	{
		// 공유 데이터
		Data data = new Data();
		Thread putThread = new Provider(data);
		Thread getThread = new Customer(data);
		
		
		putThread.start();
		getThread.start();
	}
}
