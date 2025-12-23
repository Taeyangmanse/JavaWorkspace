package com.kh.chap03.breanch;

import java.util.Scanner;

public class A_Break 
{
	/*
	 * break : 코드 실행 중 break 문을 만나게 되면 현재 속해 있는 가장 가까운 코드(반복문 등)를 탈출한다.
	 */
	Scanner sc = new Scanner(System.in);
	
	public void method1()
	{
		// 매번 반복적으로 랜덤값(1 ~ 100)을 출력
		// 단, 출력된 랜덤값이 3의 배수인 경우 반복을 종료
		
		while (true)
		{
			int i = (int)(Math.random() * 100 + 1);
			
			System.out.println("random : " + i);
			
			if (i % 3 == 0)
			{
				break;
			}
		}
	}
	
	public void method2()
	{
		while (true)
		{
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			if (str.equals("exit"))
			{
				System.out.println("종료");
				break;
			}
			
			System.out.println(String.format("%s의 글자 수 : %d", str, str.length()));
		}
	}
	
	public void method3()
	{
		// 매번 반복적으로 사용자에게 양수를 입력받아 1부터 사용자가 입력한 값까지 출력하는 프로그램을 작성하시오.
		// 단, 사용자가 입력한 양수까지 반복한 경우 반복을 종료 시키시오.
		
		while (true)
		{
			System.out.print("양수를 입력하시오 : ");
			int i = sc.nextInt();
			
			int j = 0;
			
			if (i <= 0)
			{
				System.out.println("양수를 입력해주세요!");
			}
			else
			{
				if (j != i)
				{
					while (j <= i)
					{
						System.out.print(j + " ");
						j++;
					}
					break;
				}
			}
		}
	}
	
	public void method4()
	{
		// 심볼
		
		loop1:	// 심볼 1
		for (int i = 0; i < 10; i++)
		{
			loop2:	// 심볼 2
			for (int j = 0; j < 10; j++)
			{
				System.out.println(i);
				if (i == 5) { break loop1; }
				// break : 기본적으로 가장 가까운 반복문 탈출
				// break 심볼 : 지정해둔 심볼의 반복문을 탈출
			}
		}
	}
}
