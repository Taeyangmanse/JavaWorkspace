package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu 
{
	Scanner sc = new Scanner(System.in);
	
	NumberController nc = new NumberController();
	
	public void menu()
	{
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		try 
		{
			System.out.println(String.format("%d은(는) %d의 배수인가? %b", num1, num2, nc.checkDouble(num1, num2)));
		}
		catch (NumRangeException e)
		{
			e.printStackTrace();
		}
	}
}
