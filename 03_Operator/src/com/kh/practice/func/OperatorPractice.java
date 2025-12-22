package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice 
{
	Scanner sc = new Scanner(System.in);
	
	public void practice1()
	{
		
		/*
		 * 모든 사람이 사탕을 골고루 나눠 가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		 * 1인당 동일하게 나눠 가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		 * 
		 * 인원 수: 29
		 * 사탕 개수: 100
		 * 1인당 사탕 개수: 3
		 * 남는 사탕 개수: 13
		 */
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		sc.nextLine();
		
		System.out.println("1인당 사탕 개수 : " + (candy / people));
		System.out.println("남는 사탕 개수 : " + (candy % people));
		
	}
	
	public void practice2()
	{
		/*
		 * 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		 * 이때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리하세요.
		 * 
		 * 이름: 민경민
		 * 학년(숫자만) : 3
		 * 반(숫자만) : 4
		 * 번호(숫자만) : 15
		 * 성별(M/F) : M
		 * 성적(소수점 아래 둘째자리까지) : 88.75
		 * 3학년 4반 15번 민경민 남학생의 성적은 88.75이다.
		 */
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int year = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번(숫자만) : ");
		int studNum = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char value = sc.next().charAt(0);
		char gender = value == 'M' ? '남' : value == 'm' ? '남' : '여';
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		float result = sc.nextFloat();
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다", year, classNum, studNum, name, gender, result);
	}
	
	public void practice3()
	{
		/*
		 * 나이를 키보드로 입력받아 어린이(13세이하)인지, 청소년(13세초과~ 19세이하)인지,
		 * 성인(19세초과)인지 출력하세요.
		 * 
		 * 나이: 19
		 * 청소년
		 */
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = age <= 13 ? "어린이" : (age <= 19 ? "청소년" : "성인");
		
		/*
		if (age <= 13)
		{
			result = "어린이";
		}
		else if (age <= 19)
		{
			result = "청소년";
		}
		else
		{
			result = "성인";
		}
		*/
		
		
		System.out.println(result);
	}
	
	public void practice4()
	{
		/*
		 * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
		 * 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		 * 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		 * 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		 * 
		 * 국어: 60
		 * 영어: 80
		 * 수학: 40
		 * 
		 * 합계: 180
		 * 평균: 60.0
		 * 합격
		 */
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		System.out.println("합계 : " + sum);
		
		float avg = sum / 3;
		System.out.println("평균 : " + avg);
		
		// 합격 여부
		String pass = ((kor >= 40 && eng >= 40 && math >= 40) && avg >= 60) ? "합격" : "불합격";
		
		System.out.println(pass);
		
	}
	
	public void practice5()
	{
		/*
		 * 주민 번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		 * 
		 * 주민번호를 입력하세요(-포함) : 132456-2123456
		 * 
		 * 여자
		 */
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String num = sc.next();
		
		int gender = (int)num.charAt(7);
		
		String print = (gender % 2 == 0) ? "여자" : "남자";
		// ===== 사실 문자 '1'도 49라 홀수인건 똑같음 www =====
		
		// char gender = num.charAt(7);
		// String print = (gender == '1' || gender == '3') ? "남자" : "여자";
		System.out.println(print);
	}
	
	public void practice6()
	{
		/*
		 * 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		 * 그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		 * 아니면 false를 출력하세요.
		 * (단, num1은 num2보다 작아야 함)
		 * 
		 * 정수1 : 4
		 * 정수2 : 11
		 * 입력: 13
		 * 
		 * true
		 */
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3 <= num1) || (num3 > num2) ? true : false;
		System.out.println(result);
	}
	
	public void practice7()
	{
		/*
		 * 3개의 수를 키보드로 입력받아 입력받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		 * 
		 * 입력1 : 5
		 * 입력2 : -8
		 * 입력3 : 5
		 * 
		 * false
		 */
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2) && (num2 == num3) ? true : false;
		System.out.println(result);
	}
	
	public void practice8()
	{
		/*
		 * A, B, C 사원의 연봉을 입력받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		 * 인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
		 * (A사원의 인센티브는 0.4, B사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		 * 
		 * A사원의 연봉: 2500
		 * B사원의 연봉: 2900
		 * C사원의 연봉: 2600
		 * 
		 * A사원 연봉/연봉+a : 2500/3500.0
		 * 3000 이상
		 * B사원 연봉/연봉+a : 2900/2900.0
		 * 3000 미만
		 * C사원 연봉/연봉+a : 2600/2989.9999999999995
		 * 3000 미만
		 */
		
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		
		float aa = a + a * 0.4f;	// = 1.4
		float bb = b + b * 0;	// = 1.0
		float cc = c + c * 0.15f;	// 1.15
		
		System.out.printf("A사원 연봉/연봉+a : %d/%.1f \n", a, aa);
		System.out.printf("3000 %s", aa >= 3000 ? "이상 \n" : "미만 \n");
		
		System.out.printf("B사원 연봉/연봉+a : %d/%.1f \n", b, bb);
		System.out.printf("3000 %s", bb >= 3000 ? "이상 \n" : "미만 \n");
		
		System.out.printf("C사원 연봉/연봉+a : %d/%.1f \n", c, cc);
		System.out.printf("3000 %s", cc >= 3000 ? "이상 \n" : "미만 \n");
	}
}
