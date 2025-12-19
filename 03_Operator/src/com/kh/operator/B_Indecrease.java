package com.kh.operator;

public class B_Indecrease 
{
	/*
	 * 증감 연산자 (단항 연산자)
	 * ++ : 변수에 담긴 값을 1 증가
	 * 	-> 전위 연산자 : ++변수
	 * 	-> 후위 연산자 : 변수++
	 * 
	 * -- : 변수에 담긴 값을 1 감소
	 * 	-> 전위 연산자 : --변수
	 * 	-> 후위 연산자 : 변수--
	 */
	
	public void method1()
	{
		int num = 10;
		System.out.println("전위 증감연산자 적용 전 : " + num);	// 10
		System.out.println("1회 수행 : " + ++num);	// 11
		System.out.println("2회 수행 : " + ++num);	// 12
		System.out.println("3회 수행 : " + ++num);	// 13
		System.out.println("최종 num : " + num);	// 13
		
		int num2 = 10;
		System.out.println("전위 증감연산자 적용 전 : " + num2);	// 10
		System.out.println("1회 수행 : " + num2++);	// 10(11)
		System.out.println("2회 수행 : " + num2++);	// 11(12)
		System.out.println("3회 수행 : " + num2++);	// 12(13)
		System.out.println("최종 num2 : " + num2);	// 13
		
	}
	
	public void method2()
	{
		// 전위 연산
		int a = 10;
		int b = ++a;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		// 후위 연산
		int c = 10;
		int d = c++;
		
		System.out.println("c : " + c);
		System.out.println("d : " + d);
	}
	
	public void method3()
	{
		int num1 = 20;
		int result1 = num1++ * 3;
		int result2 = ++num1 * 3;
		
		System.out.println(num1);
		System.out.println(result1);
		System.out.println(result2);
	}
	
	public void method4()
	{
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);	// 10(11)
		System.out.println((++a) + (b++));	// 12 + 20(21) = 32
		System.out.println((a++) + (--b) + (--c));	// 12(13) + 20 + 29 = 61
		System.out.printf("a : %d, b : %d, c : %d",a,b,c);	// 13, 20, 29
	}
}
