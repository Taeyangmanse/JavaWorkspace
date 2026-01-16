package com.kh.chap01_innerClass.run;

import com.kh.chap01_innerClass.part01_instance.OuterClass;
import com.kh.chap01_innerClass.part02_static.model.vo.Member;
import com.kh.chap01_innerClass.part03_local.OuterClass3;
//import com.kh.chap01_innerClass.part01_instance.OuterClass.InnerClass;

public class Run
{
	public static void main(String[] args) 
	{
		OuterClass oc = new OuterClass();
		oc.method();
		
//		InnerClass ic = oc.new InnerClass();
		
		
		// 빌더 클래스를 활용한 객체 생성
		Member m = new Member.Builder()
				.id("토끼겅듀")
				.name("김두팔")
				.age(46)
				.build();
		
		/*
		 * 빌더 클래스 이용 시 장점
		 * - 불필요한 생성자들이 없다
		 * - 필드의 순서에 상관없이 객체 생성 가능
		 * - 명시적인 메서드명으로 가독성이 확보된다.
		 * - VO 클래스에 setter 메서드가 존재하지 않음으로서 불변성 유지가 가능하다
		 * - 올바른 값이 초기화되었는지 검증이 가능
		 */
		
		OuterClass3 oc3 = new OuterClass3();
		Runnable r = oc3.getRunnable(0);
		r.run();
		
	}
}
