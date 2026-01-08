package com.kh.exception.model.vo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException 
{
	/*
	 * CheckedException은 반드시 예외처리를 해줘야 하는 예외를 말함
	 * 주로 외부 매체와의 입출력 시 발생
	 */
	
	public void method1()
	{
		try
		{
			method2();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void method2() throws IOException
	{
		// Scanner와 비슷하게 키보드로 값을 입력받을 수 있는 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		// 예외처리 방법 1 : try - catch를 통한 직접 예외 처리
//		try
//		{
//		
//			System.out.print("아무 문자열을 입력해보세요 : ");
//			// readLine() 호출 시 IOException이 발생할 수 있으므로, 반드시 예외처리를 해줘야 함!!!!
//			String str = br.readLine();		// 반드시 예외처리를 해줘야 사용할 수 있음!!
//			System.out.println("문자열의 길이 " + str.length());
//		}
//		catch (IOException e)
//		{
//			System.out.println("예외 빌생...");
//		}
		
		// 예외처리 방법 2 : throws
		// - 현재 메서드에서 예외를 처리하지 않고, 현재 메서드를 호출한 곳으로 위임하는 기능
		String str = br.readLine();
		System.out.println(str.length());
		
	}
}
















