package com.kh.chap02_abstract.part01.model.vo;

public class BasketBall extends Sports
{
	@Override
	public void rule()
	{
		System.out.println("손으로 공을 바구니 안에 넣어야 함");
	}
}
