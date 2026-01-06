package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryMenu
{
	LibraryController lc = new LibraryController();
	
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu()
	{
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		Member member = new Member(name, age, gender);
		
		lc.insertMember(member);
		
		Main:
		while (true)
		{
			System.out.println(" ===== 메뉴 =====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			if (!((menuNum >= 1 && menuNum <= 4)) || menuNum == 9)
			{
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			else 
			{
				switch (menuNum)
				{
				case 1:
					lc.myInfo();
					break;
				case 2:
					this.selectAll();
					break;
				case 3:
					this.searchBook();
					break;
				case 4:
					this.rentBook();
					break;
				default:
					System.out.println("프로그램을 종료합니다.");
					break Main;
				}
			}
		}
	}
	
	public void selectAll()
	{
		Book[] bList = lc.selectAll();
		
		for (int i = 0; i < bList.length; i++)
		{
			if (bList[i] instanceof CookBook)
			{
				System.out.println(String.format("%d번 도서: %s / %s / %s / %b\n", i, bList[i].getTitle(), bList[i].getAuthor(), bList[i].getPublisher(), (((CookBook)bList[i]).isCoupon())));
			}
			else if (bList[i] instanceof AniBook)
			{
				System.out.println(String.format("%d번 도서: %s / %s / %s / %d\n", i, bList[i].getTitle(), bList[i].getAuthor(), bList[i].getPublisher(), (((AniBook)bList[i]).getAccessAge())));
			}
		}
	}
	
	public void searchBook()
	{
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.next();
		
		Book[] searchList = lc.searchBook(keyword);
		
		for (Book b : searchList)
		{
			System.out.println(b);
		}
	}
	
	public void rentBook()
	{
		this.selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		
		int result = lc.rentBook(index);
		
		switch (result)
		{
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			break;
		}
	}
}
