package com.kh.chap05.constructor.model.vo;

public class User 
{
	// Constructor : 생성자
	
	// 필드부
	private String userID;
	private int age;
	private char gender;
	
	// 생성자부
	/*
	 * 생성자
	 * 
	 * [표현법]
	 * 접근제한자 생성자명([매개변수])
	 * {
	 * 		생성자를 통해 객체 생성시 실행할 코드
	 * }
	 * 
	 * 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위함(주된 목적)
	 * 2. 객체 생성과 동시에 매개변수로 전달된 값을 통해 필드를 초기화할 목적으로도 사용
	 * 
	 * 생성자 작성 시 주의사항
	 * 1. *** 생성자의 이름은 반드시 클래스의 이름과 완전히 동일해야 한다!!!! ***
	 * 2. 반환형이 존재하지 않는다.
	 * 여러개 생성이 가능하지만, 매개변수가 중복되면 안된다(메서드 오버로딩과 동일한 개념)
	 * 4. 매개변수 생성자를 명시적으로 작성하게 되면, 기본 생성자를 JVM이 자동으로 만들어주지 않는다.
	 */
	
	// 기본 생성자
	// - 생성자 미 작성시 JVM이 자동으로 만들어주는 생성자
	public User()
	{
		System.out.println("기본 생성자 호출");
	}
	
	// 매개변수가 있는 생성자
	// - 전달 받은 매개변수를 통해 필드를 초기화할 목적으로 사용하는 생성자
	// (주의) 해당 생성자를 만들면 기본 생성자가 자동으로 만들어지지 않기 때문에 기본 생성자와 매개변수가 있는 생성자를 둘 다 사용하고 싶으면 기본 생성자를 따로 만들어줘야 한다!!
	public User(String userID) 
	{
		this.userID = userID;
	}
	
	// 매개변수가 있는 생성자2
	// (생성자 오버로딩)
	public User(String userID, int age, char gender) 
	{
		// 다른 생성자에서 동일한 필드값을 초기화 하고 있는 경우,
		// 현재 생성자에서 다른 생성자를 호출하는 방식으로 코드를 줄일 수 있다!!
//		this.userID = userID;
//		this();		// this 생성자 호출 (기본 생성자 호출)
		this(userID); 	// this 생성자 호출 (매개변수가 있는 생성자)
		this.age = age;
		this.gender = gender;
	}
	
	// 메서드부(함수부)
	// getter/setter 메서드 생성자 생성
	
	public String getUser()
	{
		return userID;
	}
	
	public void setUser(String userID)
	{
		this.userID = userID;
	}
}
