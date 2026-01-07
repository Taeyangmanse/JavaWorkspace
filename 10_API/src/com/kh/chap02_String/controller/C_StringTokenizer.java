package com.kh.chap02_String.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

public class C_StringTokenizer 
{
	public void method()
	{
		String str = "java, oracle, JDBC, HTML, Spring";
		
		
		// 방법 1. 구분자를 제시해서 문자열을 구분자 기준으로 분리 시키는 방법
		// -> 문자열.split(구분자) : String[]로 반환
		// - 분리된 문자열들을 String[]에 담아서 관리해주는 메서드
		String[] arr = str.split(",");
		
		System.out.println(Arrays.toString(arr));
		
		// 방법 2. 분리된 각각의 문자열들을 토큰으로 취급하여 관리하는 방법
		// -> StringTokenizer stn = new StringTokenizer(문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str, ", ");
		System.out.println("분리된 문자열의 갯수 : " + stn.countTokens());
		
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
		
		// 현재 남아있는 토큰의 갯수 범위를 벗어나면 에러 발생
		
		// 현재 남아있는 토큰의 갯수가 0보다 클 때 
//		while (stn.countTokens() > 0)
		
		// stn에 토큰이 1개 이상 남아있는 경우 true 반환, 아니라면 false 반환
		while (stn.hasMoreTokens())
		{
			System.out.println(stn.nextToken());
		}
	}
}
