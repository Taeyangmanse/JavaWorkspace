package com.kh.variable;

//사용자가 키보드로 직접 입력한 값을 변수에 저장할 수 있게 도와주는 클래스
import java.util.Scanner;

public class C_Scanner 
{
	public void inputTest1()
	{
		// java가 기본적으로 가지고 있는 내장함수
		Scanner sc = new Scanner(System.in);
		
		// 사용자의 인적사항 정보 입력받기
		System.out.print("당신의 이름을 입력해 주세요: ");
		
		// 사용자가 입력한 값을 "문자열"로 받아오는 메서드
		// 1. nextLine(): 사용자가 입력한 값을 "엔터"를 기준으로 모두 가져오는 메서드
		// (값을 가져온 후 개행문자는 자동으로 비워준다.)
		
		// 2. next(): 사용자가 입력한 값을 "공백" 기준으로 가져오는 메서드
		
		// String name = sc.nextLine();
		
		String firstName = sc.next();
		sc.nextLine();	// next()의 개행문자 지워주기 작업 필요.
		String lastName = sc.nextLine();
		
		System.out.println(firstName + lastName);
		
		System.out.print("당신의 나이는 몇 살 입니까? ");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.print("당신의 키는 몇 cm 입니까? ");
		double height = sc.nextDouble();
		System.out.println(height);
		
		// 입력한 데이터를 문자형으로 뽑기
		// String의 charAt(0) -> 문자열의 첫 번째 글자를 문자로 뽑는 메서드
		System.out.print("당신의 성별은? (M/F)");
		
		// 방법 1.
		// char gender = sc.next().charAt(0);
		
		// 방법 2.
		// 사용자가 여러 글자를 입력할 것을 대비해 첫 번째 글자만을 받겠다.
		String gender = sc.next();
		char gender2 = gender.charAt(0);
		
		System.out.println(gender2);
	}
	
	
}
