package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 
{
	Scanner sc = new Scanner(System.in);
	
	public void practice3() 
	{
		System.out.print("가로 : ");
		float width = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("세로 : ");
		float height = sc.nextFloat();
		sc.nextLine();
		
		float extant = width * height;
		float perimeter = (width + height) * 2;
		
		System.out.println("면적 : " + extant);
		System.out.println("둘레 : " + perimeter);
	}
}
