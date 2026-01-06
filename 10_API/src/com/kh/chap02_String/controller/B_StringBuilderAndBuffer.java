package com.kh.chap02_String.controller;

public class B_StringBuilderAndBuffer 
{
	/*
	 * StringBuilder And StringBuffer
	 * - 문자열 기반 가변 클래스
	 * - 문자열의 메모리 부족 이슈를 해결하기 위해 만들어진 클래스
	 * - 두 클래스의 사용 방법은 동일함
	 * - 차이점은 "동기화" 여부
	 * 
	 * StringBuilder
	 * - 동기화를 지원하지 않기 때문에 "멀티 스레드 환경"에서 좋은 성능을 보이지만 안정성을 보장할 수 없다.
	 * 
	 * StringBuffer
	 * - 동기화를 지원하기 때문에 "멀티 스레드 환경"에서 스레드 안정성을 보장할 수 있으나 성능이 좋지 못하다.
	 */
	
	public void method()
	{
		String str = "Hello";
		
		str += "World";
		
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.append("World");	// 같은 저장공간에서 이어쓰기 가능
		sb1.append("!!!");		// 즉, 주소값을 1개만 사용한다.
		
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.append("World");
		sb2.append("!!!");
		
		
		System.out.println(sb1);
		System.out.println(sb2.toString());
		
		System.out.println("문자열의 길이는? " + sb1.length());
		System.out.println("문자열에서 o의 마지막 위치는? " + sb1.lastIndexOf("o"));
		
		// 0번 인덱스부터 가장 마지막 문자를 제외한 모든 문자를 삭제
//		System.out.println("가장 마지막 문자를 제회한 모든 글자 삭제 : " + sb1.delete(0, sb1.length() - 1));
		
		// 특정 위치의 문자를 삭제
		System.out.println("마지막 위치의 문자를 삭제하기 : " + sb1.deleteCharAt(sb1.length() - 1));
	}
}
