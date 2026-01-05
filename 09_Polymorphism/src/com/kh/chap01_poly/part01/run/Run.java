package com.kh.chap01_poly.part01.run;

import com.kh.chap01_poly.part01.model.vo.*;

public class Run 
{
	public static void main(String[] args) 
	{
		/*
		 * '=' (대입 연산자)를 기준으로 왼쪽과 오른쪽의 자료형은 항상 같아야 한다.
		 * 
		 * 1. 부모 타입 참조 변수로 부모 타입 객체를 다루는 경우
		 */
		
		System.out.println("1. 부모 타입 참조 변수로 부모 객체 다루기");
		
		// 부모 타입 참조 변수 p1 = 부모 타입 객체
		Parent p1 = new Parent();
		p1.printParent();
		
		// 2. 자식 타입 참조 변수로 자식 타입 객체를 다루는 경우
		System.out.println("2. 자식 타입 참조 변수로 자식 객체 다루기");
		
		// 자식 타입 참조 변수 c1 = 자식 타입 객체
		Child1 c1 = new Child1();
		c1.printParent();	// super(부모) 메서드 호출
		c1.printChild1();	// this에서 메서드 호출
		
		// 3. 부모 타입 참조 변수로 자식 타입 객체를 다루는 방법
		System.out.println("3. 부모 타입 참조 변수로 자식 타입 객체 다루기");
		
		// 부모 타입 참조 변수 p2 = 자식 타입 객체
		Parent p2 = new Child1();	// 다형성이 적용된 개념 -> 자동 형변환 이뤄짐
		
		p2.printParent();	// p2(부모 타입 변수)로는 Parent 클래스 내부의 메서드/필드만 접근 가능
		// 자식 클래스의 메서드에 접근하고자 한다면, DownCasting이 필요
		((Child1)p2).printChild1();		// DownCasting
		/*
		 * 대입 연산자 기준 양쪽의 자료형이 다름에도 불구하고 오류가 나지 않는 이유
		 * 자식 객체가 부모 자료형으로 '자동 형변환' 되고 있기 때문
		 * 
		 * (단, 상속 구조의 경우에만 클래스 간의 형변환이 가능하다.)
		 * 
		 * 클래스 간 형변환
		 * 1. 자식이 부모의 자료형으로 형변환
		 * -> UpCasting 
		 * 	- 형변환 생략 가능(묵시적 형변환, 자동 형변환)
		 *  - 부모 참조 변수 = 자식 객체
		 * 
		 * 2. 부모가 자식의 자료형으로 형변환
		 * -> DownCasting
		 *  - 반드시 명시적 형변환(강제 형변환) 필요
		 *  - ((자식)부모).자식 메서드()
		 *  
		 * 다형성을 사용하는 이유
		 *  - 부모 타입으로부터 파생된 여러가지 타입의 자식 객체들을 "하나의 부모 클래스로" 다룰 수 있기 때문
		 */
		
		// 다형성 적용 전
		// Child1 객체와 Child2 객체를 객체 배열로 다루기
		
		Child1[] arr1 = new Child1[2];
		
		arr1[0] = new Child1(1, 2, 3);
		arr1[1] = new Child1(1, 2, 3);
		
		Child2[] arr2 = new Child2[2];
		
		arr2[0] = new Child2(1, 2);
		arr2[1] = new Child2(1, 2);
		
		
		// 다형성이 적용된다면, 부모 타입 레퍼런스(참조 변수)로 다양한 자식 객체들을 받아줄 수 있다.
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1, 2, 3);
		arr[1] = new Child2(1, 2);
		arr[2] = new Child1(1, 2, 3);
		arr[3] = new Child2(3, 4);
		
		// 반복문을 활용한 메서드 호출
		for (int i = 0; i < arr.length; i++)
		{
			// 각 인덱스 별로 실제 참조하고 있는 자식 클래스로 적절히 다운 캐스팅 후
			// 메서드를 호출 하려면?
			
			// 1. instanceof 자료형 연산자 활용
			// -> 객체가 실제로 참조하고 있는 클래스를 확인하여 자료형과 같다면 true, 다르다면 false를 반환한다.
//			if (arr[i] instanceof Child1)
//			{
//				((Child1)arr[i]).printChild1();
//			}
//			else if (arr[i] instanceof Child2)
//			{
//				((Child2)arr[i]).printChild2();
//			}
			
			// 2. 오버라이딩을 이용하기
			/*
			 * 동적 바인딩
			 *  - 프로그램이 실행되기 전에는 컴파일 단계에서 참조 변수의 클래스의 메서드를 실행한다고 나오지만,
			 *  실제 런타임 단계에서는 자식 객체 내부의 오버라이딩 된 메서드를 찾아가서 실행하는 기능
			 */
			arr[i].print();
		}
	}
}
