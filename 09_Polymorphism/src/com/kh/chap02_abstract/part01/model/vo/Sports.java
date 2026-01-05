package com.kh.chap02_abstract.part01.model.vo;

// 추상 메서드가 존재하는 순간 반드시 추상 클래스로 정의해야 함.
public abstract class Sports 
{
	private int people;		// 스포츠에 참여하는 선수 숫자
	
	public Sports()
	{
		
	}

	public Sports(int people) {
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}
	
	// 경기 규칙을 설명하는 메서드
	// - 각 자식 클래스에서 반드시 오버라이딩하여, 상세한 규칙을 출력해야 한다.
	
	/*
	 * 추상 메서드
	 *  - 몸통부가 존재하지 않는 미완성된 메서드를 의미한다.
	 *  - 추상 메서드를 정의하기 위해선, abstract 예약어를 추가해야 한다.
	 *  - 만일, 클래스 내부에 추상 메서드가 존재하는 경우, 해당 클래스는 반드시 추상 클래스로 정의해야 한다.
	 *  
	 *  
	 * 추상 클래스를 사용하는 경우
	 *  - 부모 클래스를 사용하면서, 모든 자식 클래스에서 공통으로 구현해야 하는 메서드가 존재하는 경우
	 *    메서드 구현의 강제를 위해 추상 클래스를 사용한다.
	 *  - 상속이 메인이며, 메서드 강제는 서브
	 */
//	public void rule()
//	{
//		System.out.println("경기 규칙을 설명하는 메서드입니다.");
//	}
	
	public abstract void rule();
}
