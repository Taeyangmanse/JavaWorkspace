package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice 
{
	Scanner sc = new Scanner(System.in);
	
	public void practice1()
	{
		/*
		 * 사용자로 부터 한 개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다. 만일, 1 미만의 숫자가 입력됐다면
		 * “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 * 
		 * ex 1)
		 * 1이상의 숫자를 입력하세요 : 4
		 * 1 2 3 4 
		 * 
		 * ex 2)
		 * 1이상의 숫자를 입력하세요 : 0
		 * 1 이상의 숫자를 입력해주세요.
		 */
		
		while (true)
		{
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num1 = sc.nextInt();
			
			if (num1 <= 0)
			{
				System.out.println("1 이상의 숫자를 입력해주세요!");
			}
			else
			{
				for (int i = 1; i <= num1; i++)
				{
					System.out.print(i + " ");
				}
				
				break;
			}
			
		}
	}
	
	public void practice2()
	{
		/*
		 * 사용자로부터 한 개의 값을 입력받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다. 만일 , 1 미만의 숫자가 입력됐다면
		 * “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 * 
		 * 1 이상의 숫자를 입력하세요 : 4
		 * 4 3 2 1 
		 * 
		 * 1 이상의 숫자를 입력하세요 : 0
		 * 1 이상의 숫자를 입력해주세요.
		 */
		
		while (true)
		{
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num1 = sc.nextInt();
			
			if (num1 <= 0)
			{
				System.out.println("1 이상의 숫자를 입력해주세요!");
			}
			else
			{				
				for (int i = num1; i >= 1; i--)
				{
					System.out.print(i + " ");
				}
				break;
			}
		}
	}
	
	public void practice3()
	{
		/*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		 * 
		 * ex)
		 * 정수를 하나 입력하세요 : 8
		 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		 */
		
		System.out.print("정수를 하나 입력하세요 : ");
		int i = sc.nextInt();
		
		int result = 0;
		
		if (i <= 0)	// 입력받은 정수가 음수이거나 0이라면 탈출
		{
			System.out.println("정수를 입력하세요!");
		}
		else
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j);
				
				if (j == i)
				{
					result += j;
					break;
				}
				else
				{
					System.out.print(" + ");
					result += j;
				}
			}
			System.out.print(" = " + result);
		}
	}
	
	public void practice4()
	{
		/*
		 * 사용자로부터 두 개의 값을 입력받아 그 사이의 숫자를 모두 출력하세요. 
		 * 만일, 1 미만의 숫자가 입력됐다면 
		 * “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 * 
		 * ex)
		 * 첫 번째 숫자: 8
		 * 두 번째 숫자: 4 
		 * 4 5 6 7 8 
		 * 
		 * 첫 번째 숫자: 9
		 * 두 번째 숫자: 0
		 * 1 이상의숫자를입력해주세요.
		 * 첫 번째 숫자: 6
		 * 두 번째 숫자: 2
		 * 2 3 4 5 6 
		 */
		
		while (true)
		{
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if (num1 <= 0 || num2 <= 0)
			{
				System.out.println("1 이상의 숫자를 입력해주세요");
			}
			else if (num1 == num2)
			{
				System.out.println("서로 다른 숫자를 입력해 주세요");
			}
			else
			{
				if (num1 > num2)
				{
					for (int i = num2; i <= num1; i++)
					{
						System.out.print(i + " ");
					}
					break;
				}
				else
				{
					for (int i = num1; i <= num2; i++)
					{
						System.out.print(i + " ");
					}
					break;
				}
			}
		}
	}
	
	public void practice5()
	{
		/*
		 * 사용자로부터 입력받은 숫자의 단부터 9단까지 출력하세요.
		 * 단, 9를 초과하는 숫자가 입력됐다면 
		 * “9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		
		while (true)
		{
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if (num >= 10)
			{
				System.out.println("9 이하의 숫자를 입력해주세요");
			}
			else
			{
				for (int j = num; j <= 9; j++)
				{
					System.out.printf("===== %d단 =====\n", j);
					
					for (int k = 1; k <= 9; k++)
					{
						System.out.printf("%d X %d = %d\n", j, k, k * j);
					}
				}
				break;
			}
		}
	}
	
	public void practice6()
	{
		/*
		 * 사용자로부터 시작 숫자와 공차를 입력 받아 
		 * 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		 * 단, 출력되는 숫자는 총 10개입니다.
		 * 
		 * ex)
		 * 시작 숫자 : 4
		 * 공차 : 3
		 * 4 7 10 13 16 19 22 25 28 31
		 */
		
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.print(num1 + " ");
			num1 += num2;
		}
	}
	
	public void practice7()
	{
		/*
		 * 정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
		 * 단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
		 * exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
		 * 또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
		 * “0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
		 * 없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
		 * 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		 * 
		 * ex)
		 * 연산자(+, -, *, /, %) : +
		 * 정수1 : 10
		 * 정수2 : 4
		 * 10 + 4 = 14
		 */
		
		while (true)
		{
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.next();
			
			if (op.equals("exit"))
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			else
			{
				System.out.print("정수 1 : ");
				int num1 = sc.nextInt();
				
				System.out.print("정수 2 : ");
				int num2 = sc.nextInt();
				
				if ((num2 == 0) && ((op == "/") || (op == "%")))
				{
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				}
				
				else if (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%")))
				{
					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				}
				
				else
				{
					switch(op)
					{
					case "+":
						System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
						break;
					
					case "-":
						System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
						break;
						
					case "*":
						System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
						break;
						
					case "/":
						System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
						break;
						
					case "%":
						System.out.printf("%d % %d = %d\n", num1, num2, num1 % num2);
						break;
					}
				}
			}
		}
	}
	
	public void practice8()
	{
		/*
		 * 정수 입력 : 4
		 * *
		 * **
		 * ***
		 * ****
		 */
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9()
	{
		/*
		 * 정수 입력 : 4
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = num; i >= 1; i--)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice10()
	{
		/*
		 * 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		 * 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요
		 */
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		boolean result = true;
		
		if (num < 2)
		{
			System.out.println("잘못 입력하셨습니다.");
		}
		
		else
		{
			for (int i = 2; i < num; i++)
			{
				if (num % i == 0)
				{
					result = false;
					System.out.println("소수가 아닙니다.");
					break;
				}
			}
			
			if (result)
			{
				System.out.println("소수입니다.");
			}
		}
	}
	
	public void practice11()
	{
		/*
		 * 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		 * 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		 * 
		 * ex)
		 * 숫자 : 11
		 * 2 3 5 7 11
		 * 2부터 11까지 소수의 개수는 5개입니다.
		 */
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		boolean result = true;
		int sum = 0;
		
		if (num < 2)
		{
			System.out.println("잘못 입력하셨습니다.");
		}
		
		else
		{
			for (int i = 2; i <= num; i++)
			{
				for (int j = 2; j < i; j++)
				{
					if (i % j == 0)
					{
						result = false;
						break;
					}
					result = true;
				}
				if (result)
				{
					System.out.print(i + " ");
					sum++;
				}
			}
			System.out.println();
			System.out.println(String.format("2부터 %d까지 소수의 개수는 %d개입니다.", num, sum));
		}
	}
	public void practice12()
	{
		/*
		 * 1부터 사용자에게 입력 받은 수까지 중에서
		 * 1) 2와 3의 배수를 모두 출력하고
		 * 2) 2와 3의 공배수의 개수를 출력하세요.
		 * 
		 * ex)
		 * 자연수 하나를 입력하세요 : 15
		 * 2 3 4 6 8 9 10 12 14 15
		 * count : 2
		 */
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		if (num <= 0)
		{
			System.out.println("양수를 입력해주세요.");
		}
		else
		{
			for (int i = 1; i <= num; i++)
			{
				if (i % 2 == 0 || i % 3 == 0)
				{
					System.out.print(i + " ");
					
					if (i % 3 == 0 && i % 2 == 0)
					{
						count++;
					}
				}
			}
			
			System.out.println();
			System.out.println("count : " + count);
		}
	}
}
