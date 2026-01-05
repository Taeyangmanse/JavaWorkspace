package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController 
{
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width)
	{
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return String.format("%s, 넓이 : %d\n", r.toString(), height * width);
	}
	
	public String calcPerimeter(int x, int y, int height, int width)
	{
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return String.format("%s, 둘레 : %d\n", r.toString(), 2 * (height + width));
	}
}
