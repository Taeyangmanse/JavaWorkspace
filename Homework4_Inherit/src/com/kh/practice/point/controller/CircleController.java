package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController 
{
	private Circle c = new Circle();
	private static final double PI = Math.PI;
	
	public String calcArea(int x, int y, int radius)
	{
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return String.format("%s, 넓이 : %f\n", c.toString(), PI * radius * radius);
	}
	
	public String calcCircum(int x, int y, int radius)
	{
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return String.format("%s, 둘레 : %f\n", c.toString(), PI * radius * 2);
	}
}
