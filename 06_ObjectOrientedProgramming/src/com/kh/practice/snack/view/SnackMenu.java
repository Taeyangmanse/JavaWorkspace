package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu 
{
	private Scanner sc = new Scanner(System.in);
	
	private SnackController scr = new SnackController();
	
	// 사용자가 Snack 객체에 데이터를 저장할 수 있도록 값을 받고 저장한 값을 출력하는 메소드
	public void menu()
	{
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		char chack = sc.next().charAt(0);
		
		if (chack == 'y' || chack == 'Y')
		{
			System.out.println(scr.confirmData());
		}
		else if (chack == 'n' || chack == 'N')
		{
			System.out.println("시스템을 종료합니다.");
		}
		else
		{
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
