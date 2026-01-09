package com.kh.practice.book.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable
{
	// 도서명
	private String title;
	
	// 저자
	private String author;
	
	// 가격
	private int price;
	
	// 출판 날짜
	private Calendar date;
	
	// 할인률
	private double discount;
	
	public Book() {}

	public Book(String title, String author, int price, Calendar date, double discount)
	{
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author) 
	{
		this.author = author;
	}

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public Calendar getDate()
	{
		return date;
	}

	public void setDate(Calendar date)
	{
		this.date = date;
	}

	public double getDiscount()
	{
		return discount;
	}

	public void setDiscount(double discount)
	{
		this.discount = discount;
	}

	@Override
	public String toString() {
		// 방법 1. SimpleDateFormat
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
//		String df = sdf.format(date);

		// 방법 2. 포맷팅
		String df = String.format("%1$tY년 %1$tm월 %1$td일", date);
		
		return String.format("%s \t %s \t %d \t %s %f", title, author, price, df, discount);
	}
	
}
