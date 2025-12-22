package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice 
{
	Scanner sc = new Scanner(System.in);
	
	public void practice1()
	{
		System.out.print("국어 : ");
		float a = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("영어 : ");
		float b = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("수학 : ");
		float c = sc.nextFloat();
		sc.nextLine();
		
		int hap = (int)(a + b + c);
		int ave = hap / 3;
		
		System.out.println("총점 : " + hap);
		System.out.println("평균 : " + ave);
	}
}
