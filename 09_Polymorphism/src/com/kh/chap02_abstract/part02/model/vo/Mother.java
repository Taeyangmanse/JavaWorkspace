package com.kh.chap02_abstract.part02.model.vo;

// 인터페이스 상속 (implements)
// - 클래스와 클래스의 상속 관계(단일 상속) : 클래스명 extends 부모 클래스
// - 클래스와 인터페이스의 상속 관계(다중 상속) : 클래스명 implements 인터페이스1, 인터페이스2, ...
// - 인터페이스와 인터페이스의 상속 관계(다중 상속) : 인터페이스명 extends 인터페이스1, 인터페이스2, ...

public class Mother extends Person implements IBasic
{
	// 아기의 탄생 여부 : 출산, 입양, 없음
	private String babyBirth;	

	public Mother()
	{
		
	}
	
	public Mother(String name, double weight, int health, String babyBirth) 
	{
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}



	public String getBabyBirth() 
	{
		return babyBirth;
	}



	public void setBabyBirth(String babyBirth) 
	{
		this.babyBirth = babyBirth;
	}



	@Override
	public String toString() 
	{
		return "Mother [babyBirth=" + babyBirth + ", toString()=" + super.toString() + "]";
	}



	@Override
	public void eat() 
	{
		// 엄마가 밥을 먹으면
		// 몸무게 10 증가, 건강도 10 감소
		super.setWeight(getWeight() + 10);
		
		// 만약, this에 setHealth()과 같은 이름의 메서드가 없다면, 자동으로 super가 호출된다.
		setHealth(getHealth() - 10);
	}

	@Override
	public void sleep() 
	{
		// 건강도 10 증가
		setHealth(getHealth() + 10);
		
	}
	
}
