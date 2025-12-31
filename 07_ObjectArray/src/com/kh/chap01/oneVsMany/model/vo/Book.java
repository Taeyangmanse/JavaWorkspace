package com.kh.chap01.oneVsMany.model.vo;

public class Book 
{
	// 도서명, 저자명, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book()
	{
		
	}
	
	public Book(String title, String author, int price, String publisher)
	{
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}
	
	public String information()
	{
		return String.format("%s, %S, %d, %s", title, author, price, publisher);
	}
}
