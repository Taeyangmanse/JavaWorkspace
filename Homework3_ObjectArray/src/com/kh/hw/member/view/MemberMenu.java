package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu 
{
	private Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	
	// 기본 생성자
	public MemberMenu()
	{
		
	}
	
	// 메인 메뉴 출력 메서드
	public void mainMenu()
	{
		System.out.println(String.format("최대 등록 가능한 회원 수는 %d명 입니다.", mc.SIZE));
		System.out.println(String.format("\n현재 등록된 회원 수는 %d명 입니다.", mc.existMemberNum()));
		
		while (true)
		{
			int menuNum = 9;
			
			if (mc.existMemberNum() != 10)
			{
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				menuNum = sc.nextInt();	
				
				switch(menuNum)
				{
				case 1:
					
				case 2:
					
				case 3:
					
				case 4:
					
				case 5:
					
				case 9:
					
				default:
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
			else if (mc.existMemberNum() == 10)
			{
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				menuNum = sc.nextInt();	
			}
		}
	}
	
	// 회원 등록 하기 위한 데이터를 사용자에게 입력받는 메서드
	public void insertMember()
	{
		
	}
	
	// 검색 메뉴 출력 메서드
	public void searchMember()
	{
		
	}
	
	// 아이디 검색을 위한 데이터를 사용자에게 입력받는 메서드
	public void searchId()
	{
		
	}
	
	// 이름 검색을 위한 데이터를 사용자에게 입력받는 메서드
	public void searchName()
	{
		
	}
	
	// 이메일 검색을 위한 데이터를 사용자에게 입력받는 메서드
	public void searchEmail()
	{
		
	}
	
	// 수정 메뉴 출력 메서드
	public void updateMember()
	{
		
	}
	
	// 비밀번호 수정을 위한 데이터를 사용자에게 입력받는 메서드
	public void updatePassword()
	{
		
	}
	
	// 이름 수정을 위한 데이터를 사용자에게 입력받는 메서드
	public void updateName()
	{
		
	}
	
	// 이메일 수정을 위한 데이터를 사용자에게 입력받는 메서드
	public void updateEmail()
	{
		
	}
	
	// 삭제 메뉴 출력 메서드
	public void deleteMember()
	{
		
	}
	
	// 하나의 회원 삭제 결과를 출력하는 메서드
	public void deleteOne()
	{
		
	}
	
	// 전체 회원 삭제 결과를 출력하는 메서드
	public void deleteAll()
	{
		
	}
	
	// 전체 회원을 출력하는 메서드
	public void printAll()
	{
		
	}
}
