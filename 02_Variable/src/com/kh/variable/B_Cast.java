package com.kh.variable;

public class B_Cast 
{
	/*
	 * (자료)형 변환: 값의 자료형을 바꾸는 개념
	 * 
	 * 컴퓨터의 값 처리 규칙
	 * 1. 값 끼리 연산할 때는 항상 같은 자료형으로만 연산해야 한다.
	 * = (대입 연산자)도 마찬가지로 왼쪽과 오른쪽의 자료형이 같아야 한다.
	 * 만약, 왼쪽 오른쪽의 자료형이 서로 다르다면, 한 쪽을 형변환 해줘야 한다.
	 * 
	 * 형 변환의 종류
	 * 1. 자동 형변환 (묵시적 형변환)
	 * : 자동으로 형변환이 진행되기 때문에 내가 직접 형변환 할 필요가 없다.
	 * (작은 크기의 자료형 -> 크기가 큰 자료형)
	 * 
	 * 2. 강제 형변환 (명시적 형변환)
	 * : 자동 형변환이 불가능한 경우, 내가 직접 형변환 연산자를 사용하여 변환.
	 * (크기가 큰 자료형 -> 작은 크기의 자료형)
	 */
	
	public void autoCasting()
	{
		// 1. int -> double
		// 4 -> 8
		
		int i1 = 10;
		
		// 묵시적으로 double 자료형으로 형변환
		double d1 = i1;
		
		System.out.println("d1: " + d1);
		
		int i2 = 1000;
		double d2 = 3.3;
		
		// 묵시적으로 double 자료형으로 형변환
		double result = i2 + d2;
		
		System.out.println(result);
		
		// 2. int -> long 
		// 4 -> 8
		
		int i3 = 1000;
		
		// 묵시적으로 long 자료형으로 형변환
		long l3 = i3;
		
		// 3. (특이 케이스), long -> float
		// 8 -> 4
		
		// 실수는 지수 표기법을 사용하기 때문에 long 자료형보다 담을 수 있는 "값의 범위"가 훨씬 크다!!
		long l4 = 10000000000L;
		float f4 = l4;
		
		// 4. (특이 케이스), char <-> int 
		// 2 <-> 4
		
		char ch = 65;
		// 65 == 'A'
		System.out.println("ch: " + ch);
		
		int num = '민';
		System.out.println("num: " + num);
		
		// 5. (특이 케이스), byte와 short
		
		byte b1 = 12;
		byte b2 = 17;
		
		// byte와 byte의 연산, short와 short간의 연산 결과는 항상 int로 취급한다!
		// byte b3 = b1 + b2; -> error 발생0	
		byte b3 = (byte)(b1 +b2);
	}
	
	public void forceCasting()
	{
		// 1. double -> float
		
		float f1 = 4.0f;
		
		double d2 = 8.0;
		float f2 = (float)d2;
		
		// 2. double -> int 
		double d3 = 10.89;
		// 소숫점에 저장된 값은 유실된다.
		int i3 = (int)d3;
		System.out.println("i3: " + i3);
		
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = iNum + dNum; -> error 발생
		// int형과 double형이 더해지면 double형이 되기 때문 
		
		// 해결방법 1. 연산결과를 int에 맞춰 명시적 형변환
		int iSum1 = (int)(iNum + dNum);
		
		// 해결방법 2. 덧셈 연산 전에 dNum을 int로 명시적 형변환
		int iSum2 = iNum + (int)dNum;
	}
	
}
