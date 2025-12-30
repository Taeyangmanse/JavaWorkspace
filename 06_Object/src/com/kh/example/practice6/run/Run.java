package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run 
{
	public static void main(String[] args) 
	{
		Book b1 = new Book();
		Book b2 = new Book("해뤼포터", "브라더스", "J&K 롤랑");
		Book b3 = new Book("해뤼포터", "오너 브라더스", "J&K 롤랑", 2900500, 30.0);
		
		b3.inform();
	}
}
