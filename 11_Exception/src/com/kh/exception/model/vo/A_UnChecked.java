package com.kh.exception.model.vo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnChecked
{
	Scanner sc = new Scanner(System.in);
	
	/* 
	 * UnChecked Exception
	 * - RunTimeException 처럼 프로그램 실행 시 발생되는 예외들이 대표적인 UnChecked Exception 계열의 예외들이다.
	 * - RunTimeException의 자식 클래스들
	 *  1. ArrayIndexOutOfBoundsException
	 *  
	 *  2. NegativeArraySizeException
	 *  
	 *  3. ClassCastException
	 *   - 허용할 수 없는 형변환이 진행될 경우 발생하는 예외
	 *   - ex) p1이 Child2 객체로 생성된 참조 변수일 때, (Child1) p1 등을 수행하는 경우
	 *   
	 *  4. NullPointerException
	 *   - 참조 변수가 null인 상황에서 특정 메서드 및 필드에 접근하려고 할 때 발생하는 예외
	 *  
	 *  5. ArithemticException
	 *  ...
	 *  
	 *  
	 *  이러한 RunTimeException과 관련한 예외는 충분히 예측 가능한 상황이다.
	 *  예외 처리가 애초에 발생이 안되게끔, 대부분 조건문으로 해결이 가능하다.
	 *  즉, 굳이 예외처리(예외 처리 코드)를 할 필요가 없다는 의미
	 */
	public void method1()
	{
		// ArithmeticException
		// - 나누기 연산 시 0으로 나눌 때 발생
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		// 예외처리 방법 1) 조건문으로 애초에 예외가 발생하지 않게끔 처리한다.
//		if (num2 == 0)
//		{
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
//		else
//		{
//			System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
//		}
//		System.out.println("프로그램 종료");
		
		// 예외처리 방법 2) try - catch 문으로 해결하기
		/*
		 * try - catch 문
		 * - 예외가 발생했을 경우를 대비해서 실행할 내용을 정의해 두는 문법
		 * 
		 * [표현법]
		 * try
		 * {
		 * 		예외가 발생할 수 있는 코드
		 * }
		 * catch (발생할 수 있는 예외 클래스)
		 * {
		 * 		해당 예외가 발생할 시 실행할 구문
		 * }
		 */
		
		try 
		{
			// ArithmeticException이 발생할 수 있는 코드
			System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
		}
		catch (ArithmeticException ae)
		{
			System.out.println("0으로 나눌 수 없습니다.");
			ae.printStackTrace(); 	// 오류를 로그로 출력하는 기능
		}
		System.out.println("프로그램 종료");
	}
	
	public void method2()
	{
		System.out.println("정수 입력 (0제외) : ");
		
		try
		{
			int num = sc.nextInt();
			System.out.println("나눗셈 연산결과 : " + (10/num));
			
		}
		catch(ArithmeticException ae
				)
		{
			System.out.println("0으로 나눌 수 없습니다.");
		}
		catch (InputMismatchException ie) 
		{
			System.out.print("다시 입력해 주세요 :");
			int num = sc.nextInt();
			
			System.out.println("프로그램 종료");
		}
	}
	
	public void method3()
	{
		// ArrayIndexOutOfBoundsException
		// NegativeArraySizeException
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		try 
		{
			int [] arr = new int[size];
			System.out.println("100번째 인덱스의 값 : " + arr[100]);
			
		}
//		catch(NegativeArraySizeException e)
//		{
//			System.out.println("배열의 크기는 음수일 수 없다.");
//		}
//		catch (ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("부적절한 인덱스입니다");
//		}
//		catch (RuntimeException e)	// 다형성 적용
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("예외가 발생했습니다."); 	// 정확히 어떤 오류가 발생했는지 알 수 없다.
			e.printStackTrace();
		}
//		catch (ArrayIndexOutOfBoundsException e)	// 에러 발생 -> 범위가 작은 자식 크래스를 먼저 기술해야 한다.
		catch (RuntimeException e)
		{
			System.out.println("잘못된 인덱스 접근입니다.");
		}
		
		// 예외 처리 방법 1. 다중 catch 블러
		
		// 예외 처리 방법 2. 다형성을 이용한 catch
		
		
		
		/*
		 * RunTImeException 관련된 예외는 
		 * - 조건문으로 해결이 가능하기 떄문에 예외 자체가 애초에 발새이 안되게끔 소스코드로 핸들링 하는게 권장된다.
		 * - 예외 처리 구문으로도 해결이 가능하긴 하다
		 * 
		 * 예측이 가능한 상황 -> 조건문으로 해결
		 * 예측이 불가능한 상황 -> 예외처리 구문으로 해결
		 */
	}
}



















