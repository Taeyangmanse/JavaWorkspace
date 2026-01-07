package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryController
{
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
	bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true); 
	bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19); 
	bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12); 
	bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false); 
	bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true); 
	}
	
	public void insertMember(Member mem)
	{
		this.mem = mem;
	}
	
	public Member myInfo()
	{
		System.out.println(mem.toString());
		return this.mem;
	}
	
	public Book[] selectAll()
	{
		return this.bList;
	}
	
	public Book[] searchBook(String keyword)
	{		
		int BookCount = 0;
		Book[] bookInKeyword;
		int bookIndex = 0;
		
		for (Book b : bList)
		{
			boolean inKeyword = false;
			
			for (int i = 0; i < b.getTitle().length(); i++)
			{
				if (b.getTitle().charAt(i) == keyword.charAt(0))
				{
					int index = i;
					
					for (int j = 0; j < keyword.length(); j++)
					{
						if (index >= b.getTitle().length())
	                    {
	                        inKeyword = false;
	                        break;
	                    }
						
						if (b.getTitle().charAt(index) == keyword.charAt(j))
						{
							inKeyword = true;
							index++;
						}
						else
						{
							inKeyword = false;
							break;
						}
					}
					
					if (inKeyword)
					{
						BookCount++;
						break;
					}
				}
			}
		}
		
		bookInKeyword = new Book[BookCount];
		
		for (Book b : bList)
		{
			boolean inKeyword = false;
			
			for (int i = 0; i < b.getTitle().length(); i++)
			{
				if (b.getTitle().charAt(i) == keyword.charAt(0))
				{
					int index = i;
					
					for (int j = 0; j < keyword.length(); j++)
					{
						if (index >= b.getTitle().length())
	                    {
	                        inKeyword = false;
	                        break;
	                    }
						
						if (b.getTitle().charAt(index) == keyword.charAt(j))
						{
							inKeyword = true;
							index++;
						}
						else
						{
							inKeyword = false;
							break;
						}
					}
					
					if (inKeyword)
					{
						break;
					}
				}
			}
			
			if (inKeyword)
			{
				bookInKeyword[bookIndex] = b;
				bookIndex++;
			}
		}
		
		return bookInKeyword;
		
	}
	
	public int rentBook(int index)
	{
		int result = 0;
		
		if (bList[index] instanceof AniBook)
		{
			if (((AniBook)bList[index]).getAccessAge() > mem.getAge())
			{
				result = 1;
			}
		}
		else if (bList[index] instanceof CookBook)
		{
			if (((CookBook)bList[index]).isCoupon())
			{
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
			}
		}
		
		return result;
	}
}
