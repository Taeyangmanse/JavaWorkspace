package com.kh.chap02.loop;

public class A_For 
{
	 /*
	  * <반복문>
	  * - 실행할 코드를 반복적으로 수행시킬 수 있도록 도와주는 제어문
	  * - 크게 for 문과 while 문으로 나뉜다.
	  * [표현법]
	  * for (초기식; 조건식; 증감식)
	  * {
	  * 	반복적으로 수행할 코드
	  * }
	  * 
	  * - 초기식 : 반복문이 시작될 때 "처음에 단 한번만 실행"되는 구문
	  * (반복문에서 사용할 변수를 선언 및 초기화)
	  * 
	  * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	  * 조건식이 true 일 경우 반복문이 수행
	  * 조건식이 false 일 결우 반복문이 종료
	  * (보통 초기식에서 제시된 변수를 사용하여 조건식을 작성)
	  * (주의) 반드시 bool형인 값을 반환하는 형태여야 함!
	  * 
	  * - 증감식 : 반복문을 제어하는 변수값을 "증감"시키는 구문
	  * (보통 초기식에서 제시된 변수를 증감)
	  * 
	  * for문 실행 흐름
	  * 1. 초기식 실행
	  * 2. 조건식 검사
	  * 3-1. 조건식 결과가 참이라면 for 문이라면 내부 코드 실행
	  * 3-2. 조건식 결과가 거짓이라면 for문 종료
	  * 4. for문 내부 코드 실행 후 증감식 실행
	  * 5. 다시 조건식부터 쭉 반복(3-2 결과가 나올 때 까지)
	  */
	
	public void method1()
	{
		// 5회 반복하는 반복문(for문)
		for (int i = 0; i < 5; i++)
		{
			System.out.printf("%d회 반복\n", i+1);
		}
		
		for (int i = 0; i < 10; i+=2)
		{
			System.out.println(i);
		}
	}
	
	public void method2()
	{
		// 1 2 3 4 5
		for (int i = 1; i <= 5; i++)
		{
			System.out.print(i + " ");
		}
	}
	
	public void method3()
	{
		// 1과 10 사이의 정수 중 "홀수"만 출력하는 반복문
		// 출력 결과 : 1 3 5 7 9
		System.out.print("출력 결과 : ");
		for (int i = 1; i <=10; i+=2)
		{
			System.out.print(i + " ");
		}
	}
	
	public void method4()
	{
		// 1 ~ 10 까지의 총 합계
		int sum = 0;
		
		for (int i = 1; i <= 10; i++)
		{
			sum += i;
		}
		
		System.out.println("1부터 10까지의 총 합 : " + sum);
	}
	
	public void method5()
	{
		// 1에서부터 매번 달라지는 "랜덤 값" 까지의 총 합계
		
		// java.lang.Math 클래스의 random()를 호출하면,
		// 매번 다른 "실수형"의 랜덤 값을 얻어올 수 있다.
		
		// 랜덤 값의 범위
		// 0.0 <= 랜덤 값 < 1.0
		
		// 만약, 1과 10사이의 랜덤 값을 얻고 싶다면?
		// 1) 10 곱하기
		// 0.0 <= 랜덤 값 < 10.0
		
		// 2) 1 더하기
		// 1.0 <= 랜덤 값 < 11.0
		
		// 3) 소수점 버리기
		// 1 <= 랜덤 값 <= 10
		
		// 코드 -> 랜덤 값 * 10 + 1
		// 10 -> 출력하고자 하는 갯수
		// 1 -> 시작 숫자
		// Math.random() * 출력할 갯수 + 시작 수 
		
		int random = (int)(Math.random() * 10 + 1);
		System.out.println("랜덤 값 : " + random);
		
		int sum = 0;
		for (int i = 1; i <= random; i++)
		{
			sum+= i;
		}
		System.out.println("sum : " + sum);
	}
	
	public void method6()
	{
		// 문자열의 문자를 반복
		String str = "Hello World!!";
		
		for (int i = 0; i < str.length(); i++)
		{
			System.out.println(str.charAt(i));
		}
	}
	
	public void method7()
	{
		// 중첩 반복문
		// 구구단 출력
		for (int i = 1; i <= 9; i++)
		{
			System.out.printf("[ %d단 ]\n", i);
			for (int j = 1; j <= 9; j++)
			{
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
		}
	}
	
	public void method8()
	{
		/*
		 *  *****\n
		 *  *****\n
		 *  *****\n
		 *  *****\n
		 *  중첩 반복문을 이용하여 출력하기
		 */
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method9()
	{
		/*
		 * 1***\n
		 * *2**\n
		 * **3*\n
		 * ***4\n
		 * 중첩 반복문을 이용하여 출력하기
		 */
		
		for (int i = 1; i < 5; i++)
		{
			for (int j = 1; j < 5; j++)
			{
				if (j == i)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
}
