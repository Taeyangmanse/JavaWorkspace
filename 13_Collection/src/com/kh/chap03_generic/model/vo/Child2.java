package com.kh.chap03_generic.model.vo;

public class Child2 extends Parent
{
	@Override
	public void doPrint()
	{
		System.out.println("자식 2 메서드");
	}
	
	@Override
	public String toString()
	{
		return "자식 2";
	}
}
