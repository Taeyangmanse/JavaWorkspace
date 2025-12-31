package com.kh.chap01.oneVsMany.run;

import java.util.Scanner;

import com.kh.chap01.oneVsMany.model.vo.Book;

public class ObjectRun 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// 객체 배열 없이 코딩하기
		// 1. setter 초기화
		Book b1 = new Book();
		
		b1.setTitle("자바 프로그래밍");
		b1.setAuthor("자바");
		b1.setPrice(20000);
		b1.setPublisher("이지스 퍼블리싱");
		
		// 2. 매개변수 생성자로 객체 생성 및 초기화
		Book b2 = new Book("C언어", "민경민", 21000, "이지스");
		
		// 3. 매개변수 생성자로 객체 생성 및 초기화
		Book b3 = new Book("원피스", "오다 에이치로", 10000, "소년 점프");
		
		// 도서 정보 출력 서비스
		for (int i = 0; i < 3; i++)
		{
			if (i == 0)
			{
				System.out.println(b1.information());
			}
			else if (i == 1)
			{
				System.out.println(b2.information());
			}
			else
			{
				System.out.println(b3.information());
			}
		}
		
		// 객체만 있는 상태에선 작업이 비효율적이므로, 배열에 넣어서 관리해줘야 한다.
		Book arr[] = new Book[3];	// [null, null, null]
		arr[0] = b1;
		arr[1] = b2;
		arr[2] = b3;
		
		// 배열을 통해 도서정보 출력 서비스 만들기
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i].information());
		}
		
		// 사용자에게 검색할 도서 제목을 입력받아 전체 도서 목록들 중 일치하는 제목의 도서 찾기
		System.out.print("검색할 책의 제목 : ");
		String searchTitle = sc.next();
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i].getTitle().equals(searchTitle))
			{
				System.out.println(arr[i].information());
			}
		}
	}
}
