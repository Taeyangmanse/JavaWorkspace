package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.User;

public class Run 
{
	public static void main(String[] args) 
	{
		// 기본 생성자로 객체 생성
		User u1 = new User();
		
		User u2 = new User("user01");
		
		User u3 = new User("user01", 23, 'F');
		System.out.println(u3.getUser());
	}
}
