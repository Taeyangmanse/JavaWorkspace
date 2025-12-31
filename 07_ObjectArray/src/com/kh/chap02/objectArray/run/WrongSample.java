package com.kh.chap02.objectArray.run;

import com.kh.chap02.objectArray.model.vo.Phone;

public class WrongSample 
{
	public static void main(String[] args) 
	{
		Phone arr[] = new Phone[3];
		// arr 배열은 Phone이라는 사용자 정의 자료형을 가지는 인스턴스 객체를 저장하는 배열이기 때문에 해당 배열의 요소마다 객체를 초기화(할당)해줘야 한다.
		
		for (int i = 0; i < arr.length; i++)
		{
			
		}
	}
}
