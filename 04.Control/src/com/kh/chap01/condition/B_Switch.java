package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch 
{
	Scanner sc = new Scanner(System.in);
	
	/*
	 * switch 문
	 *  
	 * [표현법] 
	 * switch (동등비교 수행 대상) 
	 * { 
	 * 	case 값1: 
	 * 		경우1인 경우 실행할 코드; 
	 * 		break; 
	 * 	case 값2: 
	 * 		경우2인 경우 실행할 코드; 
	 * 		break; 
	 * 		.
	 * 		.
	 * 		.
	 * 	default:
	 * 		실행할 코드;
	 * }
	 * 
	 * switch 문과 if 문의 차이점
	 * if (조건식) => 조건식을 복잡하게 기술할 수 있음
	 * switch 문은 조건식이 없으며, 확실한 값에만 적용 가능하다
	 * 
	 * 
	 * 솔직히 switch 문 존나 구린데 왜 쓰냐?
	 * 	-> case를 통해 내가 실행하길 원하는 코드로 프리패스 하기 때문에 if - else if - else 문 보다 "훨씬 빠르다"!!
	 * 
	 * 때문에 자주 사용되지는 않지만, 정밀한 연산결과가 동일한 속도로 수행되어야 하는 경우 사용한다.
	 */
	
	public void method1()
	{
		/*
		 * 1 ~ 3 사이의 정수 값을 입력받아
		 * 1인 경우 빨간불
		 * 2인 경우 파란불
		 * 3인 경우 초록불
		 * 모두 아닌 경우 "잘못 입력했습니다"를 출력
		 */
		
		System.out.print("1 ~ 3 사이의 정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		String result = "";
		
//		if (num == 1)
//		{
//			System.out.println("빨간불");
//		}
//		else if (num == 2)
//		{
//			System.out.println("파란불");
//		}
//		else if (num == 3)
//		{
//			System.out.println("초록불");
//		}
//		else
//		{
//			System.out.println("잘못 입력했습니다.");
//		}
		
		switch (num)
		{
		case 1:
			result = "빨간불";
			break;
			
		case 2:
			result = "파란불";
			break;
			
		case 3:
			result = "초록불";
			break;
			
		default:
			result = "잘못 입력했습니다.";
		}
		
		System.out.println(result);
	}
	
	public void method2()
	{
		// 사용자로부터 구매할 과일명을 입력받아
		// 각 과일마다의 가격을 출력
		// 사과(1000), 바나나(2000), 복숭아(5000)
		
		System.out.println("KH 과일가게");
		
		System.out.print("구매할 과일(사과, 바나나, 복숭아, 망고) : ");
		String fruit = sc.next();
		
		int price = 0;
		
		switch (fruit)
		{
		case "사과":
			price = 1000;
			break;
			
		case "바나나":
			price = 2000;
			break;
			
		case "복숭아": case "망고":
			price = 5000;
			break;
		}
		System.out.printf("%s의 가격은 %d원 입니다.", fruit, price);
	}
}
