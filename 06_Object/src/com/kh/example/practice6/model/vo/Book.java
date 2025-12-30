package com.kh.example.practice6.model.vo;

import java.util.Locale;

public class Book 
{
	// 필드
//	- title : String
//	- publisher : String
//	- author : String
//	- price : int
//	- discountRate: double
	
	// 생성자
//	+ Book()
//	+ Book(title:String, publisher:String, author:String)
//	+ Book(title:String, publisher:String, author:String, price:int, discountRate:double)
	
	// 메서드(함수)
//	+ inform() : void
	
	/*
	 * 실행용 메소드로 기본 생성자와 매개변수 3개인 생성자, 
	 * 매개변수 5개인 생성자들을 통해 각각의 객체 생성 후
	 * inform()을 통해 출력
	 */
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book()
	{
		
	}
	
	public Book(String title, String publisher, String author)
	{
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate)
	{
		this(title, publisher, author);
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform()
	{
		System.out.println(String.format(Locale.GERMANY, "%s, %s, %s, %,d, %.1f", title,  publisher, author, price, discountRate));
	}
}
