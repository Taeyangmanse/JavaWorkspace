package com.kh.chap03_wrapper;

public class Run 
{
	public static void main(String[] args)
	{
		/*
		 * Wrapper 클래스
		 * -> 기본 자료형을 객체로 포장해주는 클래스들
		 * 
		 * 기본 자료형 <-> Wrapper 클래스
		 * - boolean <-> Boolean
		 * - char <-> Character
		 * - byte <-> Byte
		 * - short <-> Short
		 * - int <-> Integer
		 * - long <-> Long
		 * - float <-> Float
		 * - double <-> Double    
		 */
		
		int num1 = 10;
		int num2 = 15;
		// -> 기본 자료형은 값만을 저장하기 때문에 특별한 기능이 존재하지 않는다.
		// num1.equals(num2)같은 메서드 사용이 아예 불가능하다.
		
		// 기본 자료형 -> Wrapper 자료형으로 변환 (Boxing)
		Integer i1 = num1;
		Integer i2 = num2;
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i1.compareTo(i2));
		// a.compareTo(b)
		// a가 b보다 작은 경우 -1
		// a와 b가 같은 경우 0
		// a가 b보다 큰 경우 1
		
		// Wrapper -> 기본 자료형 (UnBoxing)
		int num3 = i1;
		int num4 = i2;
		
		System.out.println();
		
		// String 형태로 이루어진 기본 자료형을 기본 자료형으로 변환하는 방법
		String str1 = "10";
		String str2 = "15.3";
		
		// String -> 기본 자료형 : 파싱이라고 부름
		// Wrapper.클래스.parseXXX(변환할 문자열);
		int i = Integer.parseInt(str1);		// "10" -> 10
		double d = Double.parseDouble(str2);	// "15.3" -> 15.3
		
		System.out.println(i + d);
		
		// 기본 자료형 -> String 
		// 10 -> "10"
		
		// 방법 1. valueOf() 메서드 사용
		String strI1 = String.valueOf(i);
		
		// 방법 2. 자동 형변환 이용
		String strI2 = i + "";
		
		
	}
}
