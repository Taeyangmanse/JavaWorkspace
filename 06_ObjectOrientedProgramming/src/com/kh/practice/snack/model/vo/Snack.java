package com.kh.practice.snack.model.vo;

public class Snack 
{
	private String kind;	// 종류
	private String name; 	// 이름
	private String flavor;	// 맛
	private int numOf;		// 개수
	private int price; 		// 가격
	
	// 기본 생성자
	public Snack()
	{
		
	}
	
	// 매개변수가 있는 생성자
	public Snack(String kind, String name, String flavor, int numOf, int price)
	{
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	public void setKind(String kind)
	{
		this.kind = kind;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setFlavor(String flavor)
	{
		this.flavor = flavor;
	}
	
	public void setNumOf(int numOf)
	{
		this.numOf = numOf;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public String getKind()
	{
		return kind;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getFlavor()
	{
		return flavor;
	}
	
	public int getNumOf()
	{
		return numOf;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	// 담긴 데이터를 리턴하는 메서드(함수)
	public String information()
	{
		return String.format("%s(%s - %s) %d개 %,d원", kind, name, flavor, numOf, price);
	}
}
