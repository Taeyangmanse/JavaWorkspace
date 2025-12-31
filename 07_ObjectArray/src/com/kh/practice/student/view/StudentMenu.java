package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu 
{
	private StudentController ssm = new StudentController();
	
	// 학생 정보와 성적, 결과를 출력하는 기본 생성자
	public StudentMenu()
	{
		System.out.println("\n========== 학생 정보 출력 ==========");
		for (int i = 0; i < ssm.printStudent().length; i++)
		{
			System.out.println(ssm.printStudent()[i].inform());
		}
		
		System.out.println("\n========== 학생 성적 출력 ==========");
		System.out.println(String.format("학생 점수 합계 : %.0f", ssm.avgScore()[0]));
		System.out.println(String.format("학생 점수 평균 : %.1f", ssm.avgScore()[1]));
		
		System.out.println("\n========== 학생 결과 출력 ==========");
		for (int i = 0; i < ssm.printStudent().length; i++)
		{
			if (ssm.printStudent()[i].getScore() < ssm.CUT_LINE)
			{
				System.out.println(String.format("%s학생은 %s입니다.", ssm.printStudent()[i].getName(), "재시험 대상"));
			}
			else
			{
				System.out.println(String.format("%s학생은 %s입니다.", ssm.printStudent()[i].getName(), "통과"));
			}
		}
	}
}
