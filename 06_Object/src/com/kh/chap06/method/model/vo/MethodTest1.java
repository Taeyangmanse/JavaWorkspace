package com.kh.chap06.method.model.vo;

public class MethodTest1 
{
	/*
	 * 메서드(함수)
	 * 
	 * [표현법]
	 * 접근제한자 [예약어] 반환자료형 메서드명([매개변수])
	 * { 
	 * 		수행할 코드
	 * 		return [반환할 값];
	 * }
	 */
	
	// 1. 매개변수가 없고, 반환할 값도 없는 메서드
	public void method1()
	{
		System.out.println("매개변수X, 반환값X");
		
		return;		// 생략 가능(반환형이 void인 메서드는 JVM이 알아서 컴파일 할 때 추가하기 때문에 없어도 상관 없음)
	}
	
	// 2. 매개변수가 없고, 반환할 값이 있는 메서드
	public int method2()
	{
		System.out.println("매개변수X, 반환값O");
		int random = (int)(Math.random() * 100 + 1);
		
		return random;
	}
	
	// 3. 매개변수가 있고, 반환할 값이 없는 메서드
	public void method3(int x, int y)
	{
		int min = 0;
		int max = 0;
		
		if (x < y)
		{
			max = y;
			min = x;
		}
		else 
		{
			max = x;
			min = y;
		}
		
		System.out.println(String.format("최솟값은 %d, 최댓값은 %d", min, max));
	}
	
	// 4. 매개변수가 있고, 반환할 값이 있는 메서드
	public int multiply(int a, int b)
	{		
		return a * b;
	}
	
}
