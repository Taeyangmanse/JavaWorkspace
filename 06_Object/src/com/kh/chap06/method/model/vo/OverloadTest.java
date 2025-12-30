package com.kh.chap06.method.model.vo;

public class OverloadTest 
{
	/*
	 * 메서드 오버로딩
	 * - 한 클래스 내에 "같은 이름의 메서드를 여러개" 정의할 수 있는 방법
	 * - 단, 매개변수의 자료형, 개수 순서를 다르게 작성해줘야 한다.
	 * - 그 외에 매개 변수의 이름이나, 접근제한자, 반환형은 다르더라도 메서드 오버로딩에 영향을 주지 않는다.
	 */
	
	public void test()
	{
		
	}
	
	public void test(int a)
	{
		
	}
	
	// 매개변수의 개수가 같더라도, 매개변수의 자료형이 다르므로 다른 메서드로 취급한다.
	public void test(String a)
	{
		
	}
	
	public void test(int a, String b)
	{
		
	}
	
	// 자료형의 순서가 다르기 때문에 오버로딩 가능
	public void test(String a, int b)
	{
		
	}
	
	// 접근제한자는 오버로딩에 영향을 주지 않는다.
//	private void test(String a, int b)
//	{
//		
//	}
	
	// 반환형은 오버로딩에 영향을 주지 않는다.
//	public int test(String a, int b)
//	{
//		
//	}
}
