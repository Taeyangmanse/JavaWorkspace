package com.kh.chap02.loop;

public class B_While 
{
	/*
	 * while문
	 * 
	 * 
	 * [표현법]
	 * 초기식 (필수 아님!)
	 * while(조건식)
	 * {
	 * 		반복적으로 수행할 코드
	 * 		증감식 (필수 아님!)	
	 * }
	 */
	
	public void method1()
	{
		// for문을 while문으로 변경
		int i = 0;
		while (i <= 5)
		{
			System.out.println(i);
			i++;
		}
	}
	
	public void method2()
	{
		// while문으로 5회 반복하여 아래 코드 출력
		// 1 2 3 4 5
		int i = 1;
		while (i <= 5)
		{
			System.out.print(i + " ");
			i++;
		}
	}
	
	public void method3()
	{
		// 1부터 랜덤값 (1~10)까지의 총 합계를 while문으로 작성
		// 출력 예시: 1부터 XXX 까지의 합계는 XXX 입니다.
		
		int i = (int)(Math.random() * 10 + 1);
		
		int j = 1;
		
		int result = 0;
		
		while (j <= i)
		{
			result += j;
			j++;
		}
		System.out.printf("1부터 %d까지의 합계는 %d입니다.\n", i, result);
	}
	
	public void method4()
	{
		/*
		 * do-while문
		 * - 별도의 조건 검사 없이 최초 1회는 무조건 실행된다!
		 * 
		 * [표현법]
		 * do
		 * {
		 * 		반복 실행할 코드(단, 최초 1회는 반드시 수행)
		 * }
		 * while(조건식);
		 */
		
		do
		{
			System.out.println("Hello World!!");
		}
		while(false);	// 만약, 일반 while문이었다면 절대 실행되지 않았을 코드
	}
	
	public void method5()
	{
		// do-while 문을 활용하여 
		// 1 2 3 4 5 출력
		
		int i = 1;
		
		do
		{
			System.out.print(i + " ");
			i++;
		}
		while (i <= 5);
	}
}
