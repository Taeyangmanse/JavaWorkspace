package com.kh.chap01.abstraction.model.vo;

public class Student 
{
	// 학생 관리 프로그램을 만든다고 가정
	// 학생과 관련된 속성 : 번호, 이름, 전화번호, 성별, 나이, 학과, ...
	
	public String name;
	public int age;
	public double height;
	
	public void Study()
	{
		System.out.println("공부 중 ...");
	}
}
