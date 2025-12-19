package com.kh.first;
// Package + class 명 == 풀클래스 명

// Date() 클래스 추가
import java.util.Date;

public class MyFirstObject 
{
	// 자바는 실행하기 위해 반드시 main() 메서드가 존재해야 한다.
	public static void main(String[] args) 
	{
		// System.out.println(): 콘솔창에 출력하는 코드
		System.out.println("안녕");
		
		// new Date(): Date() 클래스의 객체를 생성
		// Date() 클래스: 날짜, 시간 등의 정보를 받아오는 클래스
		System.out.println(new Date());
	}
}