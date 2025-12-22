package com.kh.operator;

public class F_Triple 
{
	/*
	 * 삼항 연산자
	 * 조건식 ? 참일 경우 : 거짓일 경우;
	 */
	public void method1()
	{
		int num = 50;
		
		// num의 값이 양수인지 아닌지 판단
		boolean result = num > 0 ? true : false;
		System.out.println((result ? "양수" : "음수") + "입니다.");
	}
	
	public void method2()
	{
		int num = 0;
		
		// num의 값이 양수, 음수, 0 중 무엇인지 판단
		String result = num > 0 ? "양수" : (num < 0 ? "음수" : "0");
		System.out.println(result + "입니다.");
	}
}
