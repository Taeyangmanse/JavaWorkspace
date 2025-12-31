package com.kh.chap01.after.model.vo;

public class Product 
{
	/*
	 * 세 클래스 모두 공통적으로 가지고 있는 요소들을 정의해둘 클래스
	 */
	
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	
	public String getBrand() 
	{
		return brand;
	}
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public String getpCode()
	{
		return pCode;
	}
	
	public void setpCode(String pCode) 
	{
		this.pCode = pCode;
	}
	
	public String getpName()
	{
		return pName;
	}
	
	public void setpName(String pName)
	{
		this.pName = pName;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int price) 
	{
		this.price = price;
	}

	public Product()
	{
		
	}
	
	public Product(String brand, String pCode, String pName, int price)
	{
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	public String information()
	{
		return String.format("%s, %s, %s, %d", brand, pCode, pName, price);
	}
}
