package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController 
{
	public boolean isLeapYear(int year)
	{
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public long leapDate(Calendar c)
	{
		// 1년 1월 1일
		Calendar firstYear = new GregorianCalendar(1, 0, 1);
		
		int toYear = c.get(Calendar.YEAR);
		int toMonth = c.get(Calendar.MONTH);
		int toDay = c.get(Calendar.DATE);
		
		long days = 0;
		
		for (int i = 1; i < toYear; i++)
		{
			if (isLeapYear(i))
			{
				days += 366;
			}
			else
			{
				days += 365;
			}
		}
		
		for (int i = 0; i < toMonth; i++)
		{
			switch (i)
			{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				days += 31;
				break;
				
			case 4: case 6: case 9: case 11:
				days += 30;
				break;
			}
		}
		
		if (isLeapYear(toYear))
		{
			if (toMonth >= 2)
			{
				days += 29;
			}
		}
		else
		{
			if (toMonth >= 2)
			{
				days += 28;
			}
		}
		
		for (int i = 1; i <= toDay; i++)
		{
			days++;
		}
		
		return days;
	}
}
