package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu 
{
	private Scanner sc = new Scanner(System.in);
	
	private SquareController scr = new SquareController();
	
	private TriangleController tcr = new TriangleController();
	
	
	// 삼각형과 사각형을 선택하게 하는 메서드
	public void inputMenu()
	{
		// ===== 도형 프로그램 ===== 
		// 3. 삼각형 ==> triangleMenu() 
		// 4. 사각형 ==> squareMenu()
		// 9. 프로그램 종료 => “프로그램 종료” 출력 후 프로그램 종료 
		// 메뉴 번호 : 
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
		
		while (true)
		{
			System.out.println(" ===== 도형 프로그램 ===== ");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			if (!(num == 3 || num == 4 || num == 9))
			{
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
			else if (num == 3)
			{
				this.triangleMenu();
			}
			else if (num == 4)
			{
				this.squareMenu();
			}
			else
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
	
	// 삼각형 메뉴 출력 메서드
	public void triangleMenu()
	{
		// ===== 삼각형 ===== 
		// 1. 삼각형 면적 ==> inputSize() 
		// 2. 삼각형 색칠 ==> inputSize() 
		// 3. 삼각형 정보 ==> printInformation() 
		// 9. 메인으로 ==> “메인으로 돌아갑니다.” 출력 후 inputMenu()로 
		// 메뉴 번호 : 
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
		
		while (true)
		{
			System.out.println(" ===== 삼각형 ===== ");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 정보 : ");
			int num = sc.nextInt();
			
			if (!(num == 1 || num == 2 || num == 3 || num == 9))
			{
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
			else if (num == 1)
			{
				this.inputSize(3, 1);
			}
			else if (num == 2)
			{
				this.inputSize(3, 2);
			}
			else if (num == 3)
			{
				this.printInformation(3);
			}
			else
			{
				System.out.println("메인으로 돌아갑니다.");
				break;
			}
		}
		// 해당 함수의 무한 반복문을 탈출해 함수 자체를 탈출하게 되면 함수를 호출한 지점으로 돌아가기 때문에 자동으로 메인 메뉴로 돌아가게 된다!!
		//this.inputMenu();
	}
	
	// 사각형 메뉴 출력 메서드
	public void squareMenu()
	{
		// ===== 사각형 ===== 
		// 1. 사각형 둘레 ==> inputSize() 
		// 2. 사각형 면적 ==> inputSize() 
		// 3. 사각형 색칠 ==> inputSize() 
		// 4. 사각형 정보 ==> printInformation() 
		// 9. 메인으로 ==> “메인으로 돌아갑니다.” 출력 후 inputMenu()로 
		// 메뉴 번호 : 
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
		
		while (true)
		{
			System.out.println(" ===== 사각형 ===== ");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 정보 : ");
			int num = sc.nextInt();
			
			if (!(num == 1 || num == 2 || num == 3 || num == 4 || num == 9))
			{
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
			else if (num == 1)
			{
				this.inputSize(4, 1);
			}
			else if (num == 2)
			{
				this.inputSize(4, 2);
			}
			else if (num == 3)
			{
				this.inputSize(4, 3);
			}
			else if (num == 4)
			{
				this.printInformation(4);
			}
			else
			{
				System.out.println("메인으로 돌아갑니다.");
				break;
			}
		}
		
//		this.inputMenu();
	}
	
	// 너비와 높이를 받아 요청 사항을 처리하거나, 색깔을 받아 요청사항을 처리하는 메서드
	public void inputSize(int type, int menuNum)
	{
		// 매개변수로 들어온 type과 menuNum의 숫자에 따라 출력이 달라짐 
		 
		  // int type이 ‘삼각형’이면서 menuNum이 1번일 경우 
		  // 높이 : 
		  // 너비 :  
		  // 삼각형 면적 : ==> tc(TriangleController)의 calcArea() 출력 
		  // int type이 ‘삼각형’이면서 menuNum이 2번일 경우 
		  // 색깔을 입력하세요 : 
		  // tc의 paintColor() 호출 후 “색이 수정되었습니다” 출력 
		 
		  // int type이 ‘사각형’이면서 menuNum이 1번이나 2번일 경우 
		  // 높이 : 
		  // 너비 :  
		  // menuNum이 1번일 경우 
		  // 사각형 둘레 : ==> scr(SquareController)의 calcPerimeter() 출력 
		  // menuNum이 2번일 경우 
		  // 사각형 면적 : ==> scr의 calcArea() 출력 
		  // int type이 ‘사각형’이면서 menuNum이 3번일 경우 
		  // 색깔을 입력하세요 : 
		  // scr의 paintColor() 호출 후 “색이 수정되었습니다” 출력
		
		if (type == 3)
		{
			if (menuNum == 1)
			{
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				
				System.out.println(String.format("삼각형 면적 : %.1f", tcr.calcArea(height, width)));
			}
			else
			{
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				
				tcr.paintColor(color);
				
				System.out.println("색이 수정되었습니다");
			}
		}
		else if (type == 4)
		{
			if (menuNum == 1)
			{
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				
				System.out.println(String.format("사각형 둘레 : %.1f", scr.calcPerimeter(height, width)));
			}
			else if (menuNum == 2)
			{
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				
				System.out.println(String.format("사각형 면적 : %.1f", scr.calcArea(height, width)));
			}
			else
			{
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				
				scr.paintColor(color);
				
				System.out.println("색이 수정되었습니다");
			}
		}
	}
	
	// 매개변수에 따라 삼각형/사각형의 정보를 출력하는 메서드
	public void printInformation(int type)
	{
		// int type에 따라 print()메소드를 불러오는 controller가 다름 
		// int type이 ‘삼각형’일 경우 tc.print() 출력 
		// int type이 ‘사각형’일 경우 scr.print() 출력 
		
		if (type == 3)
		{
			System.out.println(tcr.print());
		}
		else
		{
			System.out.println(scr.print());
		}
	}
}
