package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController 
{
	public TokenController()
	{
		
	}
	
	public String afterToken(String str)
	{
		/*
		 * 방법 1: .replace(" ", ""); 으로 공백을 전부 지워버릴 수 있음
		 * 
		 * 방법 2: split(" ")을 활용하여 공백 기준으로 문자를 분리하고, 분리된 문자를 다시 하나로 합침
		 * 
		 * 방법 3. StringTokenizer 이용
		 */
		StringTokenizer st = new StringTokenizer(str, " ");
		String string = "";
		while(st.hasMoreTokens())
		{
			string += st.nextToken();
		}
		return string;
	}
	
	public String firstCap(String input)
	{
		String upper = input.toUpperCase();
		char upChar = upper.charAt(0);
		
		return String.format("%c%s", upChar, input.substring(1));
	}
	
	public int findChar(String input, char one)
	{
		int count = 0;
		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(i) == one)
			{
				count++;
			}
		}
		return count;
	}
}
