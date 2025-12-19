package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice 
{
	Scanner sc = new Scanner(System.in);
	
	public void practice1()
	{
		System.out.print("±¹¾î : ");
		float a = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("¿µ¾î : ");
		float b = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("¼öÇÐ : ");
		float c = sc.nextFloat();
		sc.nextLine();
		
		int hap = (int)(a + b + c);
		int ave = hap / 3;
		
		System.out.println("ÃÑÁ¡ : " + hap);
		System.out.println("Æò±Õ : " + ave);
	}
}
