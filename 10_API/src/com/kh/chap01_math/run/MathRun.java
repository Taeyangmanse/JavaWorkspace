package com.kh.chap01_math.run;

public class MathRun
{
	// import java.lang.Math;
	// java.lang 패키지는 보이진 않지만 내부적으로 항상 import가 되어있다.
	
	public static void main(String[] args) 
	{
		// Math 클래스의 유용한 메서드들 
		// 파이(PI)
		System.out.println("파이 : " + Math.PI);
		
		// 올림 처리 메서드
		// 올림 -> Math.ceil(double) : double형으로 반환
		double num1 = 4.349;	// 4.4로 올림 처리 하려면? -> 10 곱하면 44, 거기에 다시 10을 나누면 4.4가 된다.
		System.out.println("올림 : " + Math.ceil((num1 * 10) / 10));
		
		// 반올림 -> Math.round(double) : long형으로 반환
		System.out.println("반올림 : " + Math.round(num1));
		
		// 버림 -> Math.floor(double) : double형으로 반환
		System.out.println("버림 : " + Math.floor(num1));
		
		// 절대값 -> 음수도 양수, 양수도 양수로 만드는 메서드
		// Math.abs(int/double/long/float) : int/double/long/float로 반환 가능
		int num2 = -10;
		System.out.println("절대값 : " + Math.abs(num2));
		
		// 최소값
		// Math.min(매개변수, 매개변수) : 자료형에 맞게 반환
		System.out.println("최소값 : " + Math.min(5,  10));
		
		// 최대값 
		// Math.max(매개변수, 매개변수
		System.out.println("최대값 : " + Math.max(5,  10));
		
		// 제곱근(루트)
		// Math.sqrt(double) : double 
		System.out.println("4의 제곱근 : " + Math.sqrt(4.0));
		
		// 제곱
		// Math.pow(double, double) : double
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
	}
}
