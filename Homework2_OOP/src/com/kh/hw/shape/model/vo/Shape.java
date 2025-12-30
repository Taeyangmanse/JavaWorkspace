package com.kh.hw.shape.model.vo;

public class Shape 
{
	private int type;		// 도형 타입
	private double height; 	// 높이
	private double width;	// 폭
	private String color;	// 색상
	
	{
		color = "white";
	}
	
	public Shape()
	{
		
	}
	
	public Shape(int type, double height, double width)
	{
		this.type = type;
		this.height = height;
		this.width = width;
	}
	
	public int getType()
	{
		return type;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setType(int type)
	{
		this.type = type;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	// 높이, 너비, 색깔을 반환하는 메서드
	public String information()
	{
		return String.format("%.1f %.1f %s", height, width, color);
	}
}
