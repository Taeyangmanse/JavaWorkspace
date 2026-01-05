package com.kh.chap02_abstract.part01.model.vo;

// 일반 클래스가 아닌 추상 클래스를 상속 받게 되면,
// 추상 클래스 내부의 미구현된 추상 메서드들을
// 반드시 구현 완료해야 컴파일 에러가 사라진다.
public class FootBall extends Sports
{
	@Override
	public void rule() 
	{
		System.out.println("발로 공을 차서 골대에 넣어야 함");
	}
}
