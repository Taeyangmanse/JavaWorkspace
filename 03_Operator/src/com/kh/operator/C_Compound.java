package com.kh.operator;

public class C_Compound 
{
	/*
	 * 복합 대입 연산자
	 * -> 산술 연산자와 대입 연산자를 함께 사용하는 연산자
	 * -> 연산 속도가 빨라지므로 사용을 권장
	 * +=
	 * -=
	 * *=
	 * /=
	 * %=
	 */
	
	public void method()
	{
		int num = 10;
		
		// num = num + 3;
		num += 3;	// num = num + 3;과 동일
		
		num -= 5;
		
		num *= 7;
		
		num /= 2;
		
		num %= 2;
		
		// += 의 경우 문자열 접합이 가능
		String str = "Hello";
		str += " World";
		System.out.println(str);
	}
}
