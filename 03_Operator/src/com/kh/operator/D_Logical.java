package com.kh.operator;

import java.util.Scanner;

public class D_Logical 
{
	/*
	 * 논리 연산자
	 * -> bool 값을 반환하는 연산을 수행
	 * -> 논리 값 두개를 비교함
	 * AND : &&	-> 두 값 모두 참일 경우 true 반환
	 * 			-> 두 값 중 하나라도 거짓일 경우 false 반환
	 * OR : ||	-> 두 값 중 하나라도 참일 경우 true 반환
	 * 			-> 두 값 모두 거짓일 경우 false 반환
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void method1()
	{
		System.out.print("숫자를 하나 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// num의 값이 0보다 크면서 짝수인가?
		boolean result = (num > 0) && (num % 2 == 0);	// 논리 연산자는 어차피 우선순위가 낮아서 괄호를 치지 않아도 되지만 가독성을 위해 괄호로 구분하는 것도 나쁘지 않은 방법이다.
	}
	
	public void method2()
	{
		// 입력한 값이 1 이상 100 이하의 숫자인지 확인
		// 1 <= x <= 100 (뭐 우리가 계산할 땐 이렇게 써도 되지만 컴퓨터는 멍청해서 이렇게 쓰면 모른다)
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		boolean result = (num >= 1) && (num <= 100);
	}
	public void method3()
	{
		// 사용자가 입력한 값이 y거나 Y인 경우 참, 아니면 거짓을 반환
		System.out.print("입력 : ");
		char ch = sc.next().charAt(0);
		
		boolean result = (1 == 'y') || (ch == 'Y');
	}
	
	public void method4()
	{
		int num1 = 10;
		boolean result1 = (num1 < 5) && (num1++ > 0);	
		System.out.println("result1 : " + result1);
		System.out.println(num1);	// 10
		
		// AND 연산자의 경우 A && B의 조건 중 A의 값이 false인 경우
		// 뒤 쪽 조건들이 뭐든 이미 false이기 때문에 뒤쪽 조건식은 실행하지 않는다.
		// 이를 숏컷 익스프레션(Short-circuit Expression)라고 한다.
		
		int num2 = 10;
		boolean result2 = num2 < 20 || ++num2 > 0;
		System.out.println(num2);	// 10
		
		// OR 연산자도 마찬가지로 A || B의 조건 중 A의 값이 true인 경우
		// 뒤 쪽 조건들이 뭐든 이미 true 이기 때문에 뒤쪽 조건식은 실행하지 않는다.
		
	}
}
