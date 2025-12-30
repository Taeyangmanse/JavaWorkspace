package com.kh.example.practice3.model.vo;

public class Circle 
{
//	-PI : double = 3.14
//	-radius : int= 1
//	+  Circle()
//	+  incrementRadius() : void
//	+  getAreaOfCircle() : void
//	+  getSizeOfCircle() : void
	
//	실행용 메소드로 기본 생성자를 통해
//	Circle type의 객체를 생성 후 원의 둘레, 넓이 값
//	출력. incrementRadius()메소드를 통해 반지름 1 
//	증가 후, 다시 원의 둘레, 넓이 값 출력.
	
	private static final double PI = 3.14;
	private static int radius = 1;
	
	public Circle()
	{
		
	}
	
	public void incrementRadius()
	{
		radius += 1;
	}
	
	public void getAreaOfCircle()
	{
		System.out.println(PI * radius * radius);
	}
	
	public void getSizeOfCircle()
	{
		System.out.println(PI * radius * 2);
	}
}
