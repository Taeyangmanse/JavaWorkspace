package com.kh.operator;

public class E_LogicalNegation 
{
	/*
	 * 논리 부정 연산자
	 * !
	 * -> 논리 값을 반대로 바꿔주는 연산자
	 * -> 단항 연산자 이기 때문에 다른 논리 연산자와 다르게 우선순위가 높다!
	 */
	
	public void method()
	{
		boolean a = true;
		System.out.println("true의 부정: " + !a);
		
		boolean b = false;
		boolean b2 = !b;
		
		boolean b3 = !(5 > 3);	// false
	}
}
