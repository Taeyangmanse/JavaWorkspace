package com.kh.chap02.override.model.vo;


public class Book // extends Object 가 묵시적으로 이루어지고 있음!!
{
	private String title;
	private String author;
	private int price;
	
	public Book()
	{
		super();
	}

	public Book(String title, String author, int price) 
	{
		super();
		this.title = title;
		this.author = author;
		this.price = price;
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
	
	// 메서드 오버라이딩
	/*
	 * 오버라이딩
	 * - 상속받고 있는 부모 클래스의 메서드를 자식 클래스에서 재정의하는 것
	 * - 부모 클래스가 제공하고 있는 메서드를 자식이 일부 고쳐 사용하겠다는 의미로,
	 *   "자식 메서드가 우선권을 가진다."
	 *   
	 * 오버라이딩 성립 조건
	 * - 부모 메서드의 메서드명과 동일해야 한다.
	 * - 매개변수의 자료형, 인자의 개수, 순서도 모두 동일해야 한다.
	 * - 반환형도 동일해야 한다.
	 * - 부모 메서드의 접근 제한자 보다 공유 범위가 더 크거나 같아야 한다.
	 * 
	 * @Override 어노테이션
	 * : 컴파일러에게 해당 메서드가 오버라이딩 되었음을 명시하는 주석 같은 표시이다.
	 * - 생략 가능
	 * - 잘못된 조건으로 오버라이드를 시도한 경우 오류를 통해 잘못됨을 알릴 수 있다.
	 */
	
	@Override
	public String toString()
	{
		return String.format("%s, %s, %,d", title, author, price);
	}
}
