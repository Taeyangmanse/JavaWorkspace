package com.kh.chap02_String.controller;

public class D_StringMethod 
{
	public void method()
	{
		String str1 = "Hello World";
		
		// 1. 문자열에서 한 글자를 추출하는 메서드
		// : 문자열.charAt(int index) : char형으로 반환
		
		// 2. 문자열의 길이를 반환하는 메서드
		// : 문자열.length() : int형으로 반환
		
		// 3. 문자열과 문자열을 이어주는 메서드
		// : 문자열.concat(String str) : String형으로 반환
		
		// 4. 문자열의 시작 인덱스 위치부터 끝까지의 문자열을 추출하여 반환하는 메서드
		// : - 문자열.substring(int beginIndex) : String형으로 반환
		//   - 문자열.substring(int beginIndex, int endIndex) : String형으로 반환
		
		// World만 추출
		System.out.println(str1.substring(6));	// 6번 인덱스부터 끝까지
		System.out.println(str1.substring(0, 5));	// 0번 인덱스부터 5개
		
		// 5. 문자열에서 old 문자를 new 문자로 변환한 문자열을 반환하는 메서드
		// : 문자열.replace(char old, char new) : String형으로 반환
		String str2 = str1.replace('l', 'c');
		System.out.println("str2 : " + str2);
		
		// 6. 문자열의 앞, 뒤 공백을 제거한 문자열을 반환하는 메서드
		// : 문자열.trim() : String형으로 반환
		String str3 = "          J A V A        ";
		System.out.println("trim() : " + str3.trim());
		
		// 7. 대문자 또는 소문자로 변경하는 메서드
		// : - 문자열.toUpperCase() : 대문자로 변경
		//   - 문자열.toLowerCase() : 소문자로 변경
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		// 8. 문자열을 각각의 문자 형태로 배열에 담는 메서드
		// : 문자열.toCharArray() : char[]로 반환
		char[] arr1 = str1.toCharArray();
		
		// 9. 전달된 자료형의 값을 문자열로 반환해주는 메서드 
		// : static valueOf(다양한 자료형) : String
		System.out.println(String.valueOf(arr1));
		
		// 10. 해당 문자가 문자열 안에서 몇번째 인덱스에 위치해 있는지 검사하는 메서드
		// : 문자열.indexOf(문자) : int형으로 반환
	}
}
