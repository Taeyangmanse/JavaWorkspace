package com.kh.chap02.objectArray.run;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ArrayForeach 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[3];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = (i + 1) * 10;
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		// 향상된/개선된 반복문
		// advanced loop/foreach
		/*
		 * foreach문
		 * - 배열 또는 컬렉션과 함께 사용되는 반복문으로, 배열 또는 컬렉션의 0번 인덱스부터, 마지만 인덱스까지 순차적으로 접근할 때 사용.
		 * - 초기식, 조건식, 증감식 X
		 * - 반복 횟수는 배열의 크기
		 * 
		 * [표현법]
		 * for(순차적으로 접근한 값을 담을 변수 : 배열명)
		 * {
		 * 		반복할 코드
		 * }
		 */
		
		int arr2[] = {10, 20, 30};
		
		for (int i : arr2)
		{
			System.out.println(i);
		}
		
		Phone p1[] = new Phone[3];
		
		p1[0] = new Phone("갤럭시", "삼성", "노트21", 1500000);
		p1[1] = new Phone("아이폰", "애플", "10프로", 1900000);
		p1[2] = new Phone("갤럭시", "삼성", "노트25", 1600000);
		
		// Phone 객체 배열에 저장된 핸드폰 가격들의 총 합 구하기
		int result = 0;
		
		for (Phone p : p1)
		{
			result += p.getPrice();
		}
		
		System.out.println(result);
	}
}
