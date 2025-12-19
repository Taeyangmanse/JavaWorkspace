package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 
{
	Scanner sc = new Scanner(System.in);
	
	public void practice2()
	{
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int hap = num1 + num2;
		System.out.println("더하기 결과 : " + hap);
		
		int min = num1 - num2;
		System.out.println("빼기 결과 : " + min);
		
		int gop = num1 * num2;
		System.out.println("곱하기 결과 : " + gop);
		
		int na = num1 / num2;
		System.out.println("나누기 결과 : " + na);
	}
}
