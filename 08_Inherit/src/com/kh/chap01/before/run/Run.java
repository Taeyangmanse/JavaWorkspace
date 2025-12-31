package com.kh.chap01.before.run;

import com.kh.chap01.before.model.vo.Desktop;
import com.kh.chap01.before.model.vo.SmartPhone;

public class Run 
{
	public static void main(String[] args)
	{
		// 데스크탑 객체
		Desktop d = new Desktop("삼성", "d-01", "데탑", 2000000, true);
		
		// 스마트폰 객체
		SmartPhone sp = new SmartPhone("애플", "s-01", "아이폰11", 1300000, "KT");
		
		System.out.println(d.information());
	}
}
