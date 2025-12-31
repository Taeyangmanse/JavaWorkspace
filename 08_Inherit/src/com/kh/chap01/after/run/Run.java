package com.kh.chap01.after.run;

// * : 해당 주소 아래의 모든 파일을 import 함
import com.kh.chap01.after.model.vo.*;

public class Run 
{
	public static void main(String[] args) 
	{
		Desktop dt = new Desktop("삼성", "d-01", "삼성 데탑", 200000, true);
		
		SmartPhone sp = new SmartPhone("애플", "s-01", "아이폰11", 1300000, "KT");
		
		Tv tv = new Tv("LG", "t-01", "얇은 TV", 3500000, 60);
		
		System.out.println(dt.information());
		System.out.println(sp.information());
		System.out.println(tv.information());
		
		// 만약, 실행하고자 하는 메서드가 자식 클래스에 없다면, 
		// 자동으로 부모 클래스의 메서드를 실행한다.
		
		// 단, 자식 클래스에 부모 클래스에 존재하는 메서드를 재정의(오버라이딩)했다면,
		// 자식 클래스가 실행 우선권을 가진다.
		
		/*
		 * 상속의 특징 
		 * - 클래스 간의 상속은 다중 상속이 불가능하다(단일 상속만 지원)
		 * - 명시되어 있지 않지만, 모든 클래스는 "Object 클래스의 자식"이다.
		 * => Object의 메서드를 사용할 수 있다.
		 * => Object의 메서드가 마음에 안들면 오버라이딩이 가능하다.
		 */
	}
}
