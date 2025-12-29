package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Student;

public class Run 
{
	public static void main(String[] args) 
	{
		/*
		 * 1. 객체 지향 언어 : 객체를 중심으로 객체 간의 상호작용을 통해 동작하는 프로그래밍 방식
		 * 2. 객체(Object) : new 연산자와 클래스(랑 생성자)를 통해 메모리(Heap 영역)에 할당된 데이터
		 * 3. 객체 지향 프로그래밍 : 현실 세계에서 독립적인 객체 간의 상호작용을 프로그래밍을 통해 코드로 구현하는 과정
		 * 4. 구현하고자 하는 프로그램 상의 필요한 객체를 만들기 위해선 "클래스"라는 틀을 먼저 만들어야 한다.
		 * 5. 추상화 & 캡슐화를 하는 방법
		 *  - 내가 구현하고자 하는 프로그램의 목적에 맞는 객체를 선정 후 그 객체들이 가지고 있을 핵심적인 역할의 속성과 기능만 남긴다.
		 */
		
		Student han = new Student();
		han.name = "한길동";
		han.age = 16;
		han.height = 180.0;
		
		Student jung = new Student();
		jung.name = "정유민";
		jung.age = 21;
		jung.height = 165.5;
	}
}
