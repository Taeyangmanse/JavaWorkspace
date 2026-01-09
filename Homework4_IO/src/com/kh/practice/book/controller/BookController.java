package com.kh.practice.book.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController 
{
	private BookDAO bd = new BookDAO();
	
	public void makeFile()
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream("book.txt");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public void fileSave(Book[] bArr)
	{
		bd.fileSave(bArr);
	}
	
	public Book[] fileRead()
	{
		return bd.fileRead();
	}
}
