package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If 
{
	/*
	 * 조건문(제어문)
	 *  - 조건식을 통해 참/거짓을 판단하여 그에 해당하는 코드를 실행
	 *  - 조건식은 보통 비교 연산자, 논리 연산자를 사용하여 작성한다.
	 *  - 조건문은 if / switch 문으로 나뉜다.
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void method()
	{
		/*
		 * 단독 if 문
		 * [표현법]
		 * if (조건식)
		 * {
		 * 		조건식이 참일 경우 실행할 코드
		 * }
		 */
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0)
		{
			System.out.println("양수다.");
		}
		
		if (num <= 0)
		{
			System.out.println("양수가 아니다.");
		}
	}
	
	public void method2()
	{
		/*
		 * if - else 문
		 * [표현법]
		 * if (조건식)
		 * {
		 * 		조건식이 참인 경우 실행할 코드
		 * }
		 * else
		 * {
		 * 		조건식이 거짓인 경우 실행할 코드
		 * }
		 */
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0)
		{
			System.out.println("양수다.");
		}
		else 
		{
			System.out.println("양수가 아니다.");
		}
	}
	
	public void method3()
	{
		/*
		 * if - else if 문
		 * : 같은 비교 대상으로 여러 개의 조건을 제시해야 하는 경우 사용
		 * [표현법]
		 * if (조건식1)
		 * {
		 * 		조건식1이 참인 경우 실행할 코드
		 * }
		 * else if (조건식2)
		 * {
		 * 		조건식2가 참인 경우 실행할 코드
		 * }
		 * else
		 * {
		 * 		위 조건들이 모두 거짓인 경우 실행할 코드
		 * }
		 */
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0)
		{
			System.out.println("양수다.");
		}
		
		else if (num == 0)
		{
			System.out.println("0이다.");
		}
		
		else 
		{
			System.out.println("양수가 아니다.");
		}
	}
	
	public void method4()
	{
		/*
		 * 사용자가 입력한 나이를 가지고 어린이/청소년/성인/어르신 출력
		 * 어린이(13세 이하), 청소년(13세 초과, 19세 이하), 성인(19세 초과, 60세 이하), 어르신(60세 초과)
		 */
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		
		if (age <= 13)
		{
			System.out.println("어린이 입니다.");
		}
		
		else if (age <= 19)
		{
			System.out.println("청소년 입니다.");
		}
		
		else if (age <= 60)
		{
			System.out.println("성인 입니다.");
		}
		
		else
		{
			System.out.println("어르신 입니다.");
		}
	}
	
	public void method5()
	{
		// 성별과 이름을 입력 받아, 이름과 성별을 출력
		// 성별은 m/f로 입력 받고, 출력 시에는 남자, 여자로 출력
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		String result = "";
		
		if (gender == 'm' || gender == 'M')
		{
			result = "남자";
		}
		
		else if (gender == 'f' || gender == 'F')
		{
			result = "여자";
		}
		
		else 
		{
			System.out.println("정상적인 성별을 입력해주세요.");
		}
		
		System.out.printf("%s님은 %s입니다.", name, result);
	}
	
	public void method6()
	{
		// 사용자에게 이름을 입력받아 본인 이름과 일치하는지 비교하기
		String name = sc.nextLine();
		
//		if (name == "민경민")
//		{
//			System.out.println("민경민님 반갑습니다.");
//		}
//		else
//		{
//			System.out.println("민경민님이 아닙니다.");
//		}
		
		if (name.equals("민경민"))
		{
			System.out.println("민경민님 반갑습니다.");
		}
		else
		{
			System.out.println("민경민님이 아닙니다.");
		}
	}	
}