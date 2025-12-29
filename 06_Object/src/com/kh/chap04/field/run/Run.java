package com.kh.chap04.field.run;

import com.kh.chap04.field.model.vo.FieldTest1;
import com.kh.chap04.field.model.vo.FieldTest2;
import com.kh.chap04.field.model.vo.FieldTest3;

public class Run 
{
	public static void main(String[] args) 
	{
		FieldTest1 ft1 = new FieldTest1();
		
		FieldTest2 ft2 = new FieldTest2();
//		ft2.pub = "";
		
		// static 메서드(함수)와 필드는 객체를 생성하지 않고 클래스 명으로 사용 가능하다.
		// 객체를 생성하지 않아도, 이미 메모리에 저장 공간이 할당되어 있기 때문
		
		// static 필드 및 메서드 호출 방법
		// 클래스명.static 필드명 or 클래스명.static 메서드명()
		FieldTest3.test();
		
	}
}
