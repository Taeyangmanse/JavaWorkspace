package com.kh.chap02_scheduling.run;

public class Run 
{
	public static void main(String[] args) 
	{
		/*
		 * 스레드 스케줄링
		 * - 스레드의 작업 순서를 조절하는 방법
		 * 
		 * 
		 * Round Robin(R.R) :  순환 할당 방식
		 * - 각 스레드에게 시간 할당량을 정하여 정해진 시간 만큼만 스레드를 실행 시키는 방식이고,
		 * - 시간 할당량은 모든 스레드에게 동일하게 주어진다.
		 * - 만약, 스레드 간의 우선 순위가 부여된 경우, 
		 * - 우선 순위가 높은 스레드가 더 많은 작업 시간을 할당 받는다. (우선 순위 기반 스케줄링)
		 * - 스레드 간의 우선순위가 동일한 경우 동일한 시간 할당량이 주어진다.
		 * - RR은 OS가 알아서 정하는 스케줄링 방식으로, 소스 코드로 제어가 불가능하다.
		 *
		 * 
		 * 우선 순위 기반 스케줄링
		 * - 스레드마다 우선 순위를 부여하는 방식
		 * - 우선 순위가 더 높은 스레드가 더 많은 작업 시간을 할당 받는다.
		 * - 소스 코드로 스레드의 우선 순위를 부여할 수 있다.
		 * 
		 * 
		 */
		
		Thread t1 = new Thread(() ->
		{
			// 현재 스레드의 이름
			System.out.println(Thread.currentThread().getName());
			for (int i = 0; i < 20; i++)
			{
				System.out.println("Car Driving...");
				
				try 
				{
					// 스레드를 일시 정지 시키는 메서드
					Thread.sleep(100);
				} 
				catch (Exception e) 
				{
					
				}
			}
		});
		
		// Plane
		Thread t2 = new Thread(() ->
		{
			// 현재 스레드의 이름
			System.out.println(Thread.currentThread().getName());
			
			for (int i = 0; i < 20; i++)
			{
				System.out.println("Plane");
				
				try 
				{
					Thread.sleep(100);
				} 
				catch (Exception e) 
				{
					
				}
			}
				
		});
		
		Thread t3 = new Thread( () -> 
		{
			System.out.println(Thread.currentThread().getName());
			
			for (int i = 0; i < 20; i++)
			{
				System.out.println("tank");
				try 
				{
					Thread.sleep(100);
				} 
				catch (Exception e) 
				{
					
				}
			}
		});
		t1.setName("car");
		t2.setName("plane");
		t3.setName("tank");
		
		
		/*
		 * 우선순위 설정
		 * - 각 스레드는 기본적으로 5의 우선순위를 가지고 있음
		 * - 1 ~ 10 사이의 정수값을 대입하여 우선순위를 변경할 수 있음
		 * 
		 * 
		 */
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		
		/*
		 * 데몬 스레드 
		 * - 특정 스레드에 종속적인 스레드를 데몬 스레드라고 부른다.
		 * - 백그라운드 작업용 스레드
		 * - 메인 스레드 종료 시, 데몬 스레드도 함께 종료된다.
		 * 
		 * 
		 */
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("메인 스레드 종료");
		
		
	}
}








