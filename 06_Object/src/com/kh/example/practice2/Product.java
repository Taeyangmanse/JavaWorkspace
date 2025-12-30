package com.kh.example.practice2;

public class Product 
{
	/*
	 * - pName : String
	 * - price : int
	 * - brand : String
	 * + Product()
	 * + information() : void
	 */
	private String pName;
	private int price;
	private String brand;
	
	// 기본 생성자
	public Product()
	{
		
	}
	
	public void information()
	{
		System.out.println(String.format("%s, %d, %s", pName, price, brand));
	}
}
