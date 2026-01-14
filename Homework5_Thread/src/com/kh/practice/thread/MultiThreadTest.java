package com.kh.practice.thread;

public class MultiThreadTest 
{
	public static void main(String[] args) 
	{
		// 공유 데이터
		Data data = new Data();
		Thread putThread;
		Thread getThread;
		
		Thread provider = new Thread(new Provider(data));
		Thread customer = new Thread(new Customer(data));
		
		provider.start();
		customer.start();
	}
}
