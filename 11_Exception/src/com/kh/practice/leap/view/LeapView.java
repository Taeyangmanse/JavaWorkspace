package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.leap.controller.LeapController;

public class LeapView 
{
	LeapController lc = new LeapController();
	Scanner sc = new Scanner(System.in);
	
	public LeapView()
	{
		System.out.print("연도를 입력하시오 : ");
		int inputYear = sc.nextInt();
		
		Calendar inputCal1 = new GregorianCalendar(inputYear, 11, 31);
		Calendar inputCal2 = new GregorianCalendar(inputYear, 0, 1);

		boolean isInputLeap = lc.isLeapYear(inputYear);
		
		if (isInputLeap)
		{
			System.out.println(String.format("%d년은 윤년입니다.", inputYear));
			
		}
		else
		{
			System.out.println(String.format("%d년은 평년입니다.", inputYear));
		}
		
		System.out.println("총 날짜 수(입력한 연도의 12월 31일 기준) : " + lc.leapDate(inputCal1));
		System.out.println("총 날짜 수(입력한 연도의 1월 1일 기준) : " + lc.leapDate(inputCal2));
		
		
		// 현재 시간
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);

		boolean isLeap = lc.isLeapYear(year);
		
		if (isLeap)
		{
			System.out.println(String.format("올해인 %d년은 윤년입니다.", year));
			
		}
		else
		{
			System.out.println(String.format("올해인 %d년은 평년입니다.", year));
		}
		
		System.out.println("총 날짜 수 : " + lc.leapDate(cal));
	}
}
