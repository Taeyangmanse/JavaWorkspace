package com.kh.variable;

public class A_Variable 
{	
	// public: 접근제한자
	// void: return 값
	// printVariable: 메서드(함수)명
	// 시급과 근무 시간과 근무 일수를 곱해 월급을 계산해주는 메서드(함수)
	public void printVariable()
	{
		System.out.println("=== 변수 사용 전 ===");
		System.out.println("시급 : 8500");
		System.out.println("근무 시간 : 6");
		System.out.println("근무 일수 : 5");
		
		System.out.println("정유민 : " + 8500 * 6 * 5);
		
		int pay = 8500;
		int time = 6;
		int day = 5;
		
		System.out.println("=== 변수 사용 후 ===");
		
		System.out.println("정유민 : " + pay * time * day);
		System.out.println("정유민1 : " + pay * time * day);
		System.out.println("정유민2 : " + pay * time * day);
		System.out.println("정유민3 : " + pay * time * day);
		
		/*
		 * 변수를 사용하는 이유
		 * 1. 가독성 확보
		 * 2. 재사용성 증대
		 * 3. 유지 보수성 증대
		 */
		
	}

	public void declareCariable()
	{
		/*
		 * 변수의 선언
		 * [표현법]
		 * 자료형 변수명 {= 초기화 값};
		 * ({}부분은 생략 가능)
		 * 
		 * 자료형: 어떤 값을 담아낼 지 어떤 크기의 값을 담아낼 지에 따라 다르게 지정하는 부분.
		 * 구체적으로는 담아낼 값의 크기에 따라 메모리에 공간을 할당하는 것 
		 * 
		 * 변수명: 값이 담긴 공간을 식별하기 위한 이름
		 * 담겨있는 값을 최대한 잘 표현해야 한다.
		 * 
		 * 변수명 명명 규칙
		 * 1. 변수명은 "영어 소문자"로 시작하여 작성한다.
		 * 2. 낙타등 표기법을 사용한다. (Camel Case)(= camelCase 식으로 표기)
		 * 
		 * 주의 사항
		 * 1. 변수 선언은 클래스 아래 영역, 메서드(함수) 내부에서만 사용 가능
		 * 2. 같은 영역 안에서 동일한 이름의 변수명 사용 불가
		 * 3. 같은 영역 안에서 선언한 변수는 해당 영역에서만 사용 가능
		 */
		
		// ===== 기본 자료형 =====
		// 1. 논리형(bool형) 변수
		
		boolean isTrue = true;
		
		
		// 2. 숫자형 변수
		
		// 2-1. 정수형
		// 1byte: -128 ~ 127
		byte bNum;
		
		// 2byte: -3만 2천 ~ 3만 2천
		short sNum;
		
		// 4byte, 정수 대표 자료형
		int iNum;
		
		// 8byte
		long lNum;
		
		
		// 2-2. 실수형
		// 4byte: 소숫점 7자리까지 표현
		float fNum;
		
		// 8byte: 소숫점 15자리까지 표현, 실수 대표 자료형
		double dNum;
		
		
		// 3. 문자형
		// 2byte: 0 ~ 65535
		char ch;
		
		// ===== 참조 자료형 ===== 
		// 4. 문자열
		// 유동적인 크기를 가짐
		String str;
		
		// 변수에 값을 처음 대입하는 행위: 초기화
		// 자바에서는 반드시 변수를 초기화 하고 사용해야 한다.
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		fNum = 4.0f;	// 실수 리터럴 값을 float에 저장 시 반드시 f를 붙인다.
		dNum = 8.0;
		
		ch = 'A';
		
		str = "ABC";
	}
	
	public void initVariable()
	{
		// 변수 선언과 동시에 값을 대입(초기화)
		boolean isTrue = false;
		
		// _는 실제로 입력되지 않음으로 정상적으로 9억을 할당할 수 있음
		int longInteger = 999_999_999;
		// 128 ~ 127
		byte bNum = 1;
		System.out.println(bNum);
		
		int iNum = 127;
		
		bNum = (byte)(iNum + 15);
		System.out.println(bNum);
	}
	
	// constant: 상수
	public void constant()
	{
		int age = 20;
		age = 21;
		
		// final 키워드를 붙여 상수화 할 수 있음
		// 상수를 선언할 때는 반드시 선언과 동시에 초기화를 해야한다.
		// 상수의 이름은 상수임을 표시하기 위해 전부 대문자로 짓는다.
		final int AGE = 21;
		// AGE = 22; -> error 발생
		
	}
}
