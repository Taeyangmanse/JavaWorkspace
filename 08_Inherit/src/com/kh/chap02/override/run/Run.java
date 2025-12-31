package com.kh.chap02.override.run;

import com.kh.chap02.override.model.vo.Book;

public class Run 
{
	public static void main(String[] args)
	{
		Book b1 = new Book("수학의 정석", "에듀윌", 12000);
		System.out.println(b1);
		
		/*
		 * 출력문(println) 안에 참조 변수를 제시하여 출력하는 경우,
		 * 내부적으로 항상 toString() 메서드가 호출되며 그 결과 값이 출력된다.
		 * 
		 * toString() 메서드는 부모 클래스인 Object 클래스에 정의되어 있으며,
		 * 풀클래스명 + @ + 주소값을 문자열로 반환하는 메서드이다.
		 * 
		 * 이 메서드를 오버라이딩 하면, 참조 변수를 제시하는 것 만으로 객체 내부의 값들을 한번에 출력문으로 받아볼 수 있다.
		 */
	}
}
