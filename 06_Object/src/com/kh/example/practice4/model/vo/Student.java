package com.kh.example.practice4.model.vo;

public class Student 
{
//	- grade : int
//	- classroom : int
//	- name : String
//	- height : double
//	- gender : char
//	+ Student()
//	+ information() : void
	// 초기화 블럭을 이용해 각 필드 초기화
	
	private static int grade;
	
	static 
	{
		grade = 50;
	}
	
	private int classroom;

	private String name;

	private double height;

	private char gender;
	
	{
		classroom = 20;
		name = "정유민";
		height = 166.5;
		gender = 'F';
	}
	
	public Student()
	{
		
	}
	
	public void information()
	{
		System.out.println(String.format("grade : %d, classroom : %d, name : %s, height : %.1f, gender : %c", grade, classroom, name, height, gender));
	}
}
