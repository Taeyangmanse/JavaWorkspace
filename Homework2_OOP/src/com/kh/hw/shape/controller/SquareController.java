package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController 
{
	private Shape s = new Shape();
	
	
	// 모양 타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화 시킨 후 둘레 반환
	// 둘레 : 너비 * 2 + 높이 * 2
	public double calcPerimeter(double height, double width)
	{
		s = new Shape(4, height, width);
		
		return height * 2 + width * 2;
	}
	
	// 모양 타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화 시킨 후 둘레 반환
	// 넓이 : 너비 * 높이
	public double calcArea(double height, double width)
	{
		s = new Shape(4, height, width);
		
		return height * width;
	}
	
	// setter를 이용해 받아온 매개변수로 값 변경
	public void paintColor(String color)
	{
		s.setColor(color);
	}
	
	// 어떤 모양인지와 Shape의 information() 메서드의 반환 값을 합쳐 함께 반환
	public String print()
	{
		return String.format("사각형 %s", s.information());
	}
}
