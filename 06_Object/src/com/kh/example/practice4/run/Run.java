package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run 
{
	public static void main(String[] args) 
	{
		// 실행용 메소드로 기본 생성자를 통해 Student 객체 생성 후 information()으로 정보 출력
		Student std = new Student();
		std.information();
	}
}
