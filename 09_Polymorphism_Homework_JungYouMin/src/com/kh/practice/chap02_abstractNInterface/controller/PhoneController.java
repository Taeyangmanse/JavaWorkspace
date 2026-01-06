package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController 
{
	private String[] result = new String[2];
	
	public String[] method()
	{
		Phone[] phone = new Phone[2];
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		for (int i = 0; i < phone.length; i++)
		{
			// 1안 instanceof
			if (phone[i] instanceof GalaxyNote9)
			{
				result[i] = ((GalaxyNote9)phone[i]).printInformation();
			}
			else
			{
				result[i] = ((V40)phone[i]).printInformation();
			}
			
			// 2안 Down Casting
			// result[i] = ((SmartPhone)phone[i]).printInformation();
		}
		
		return result;
	}
}
