package com.kh.chap01.after.model.vo;

public class Desktop extends Product
{
	private boolean allInOne;
	
	public void Desktop()
	{
		
	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) 
	{
		/*
		 * 상속 메모리 구조 보여주기
		 * 부모 객체 필드의 값 초기화 하기
		 * 
		 * 방법 1. 자식 클래스에서 부모 클래스의 멤버에 접근 가능하도록 접근 제한자를 수정하기( public / protected )
		 *  
		 * 방법 2. super() 예약어를 이용해 부모 클래스의 생성자를 호출
		 * 
		 * 방법 3. 부모 클래스에 있는 setter 메서드 사용
		 * (부모 자식 간의 상속이 이루어져 있기 때문에 super 키워드 쓸 필요도 없고, 부모의 객체를 생성할 필요도 없이 자기 멤버처럼 사용할 수 있다.)
		 * 
		 * super는 일종의 부모의 주소값을 담고 있는 변수 같은 것이다.
		 * super(); 식으로 부모의 기본 생성자를 호출할 수 있다.
		 */
		
		// super() 예약어를 이용해 부모 클래스의 생성자를 호출해 필드의 값을 초기화 함
		super(brand, pCode, pName, price);
		
		// super(); 만 쓸 경우 부모 클래스의 기본 생성자를 호출하게 됨
		// 또한, 부모 클래스에 기본 생성자가 정의되어 있지 않은 상태(생성자를 명시적으로 작성해두면 자동으로 기본 생성자를 만들어 주지 않음)에서는 super()를 쓸 수 없고,
		// 반드시 super(값) 형태로 매개변수를 전달 받아야 한다.
		
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// 객체의 정보를 문자열로 반환하는 메서드
	// 오버라이딩 : 자식 클래스에서 부모 클래스에 있는 메서드와 동일한 이름을 가진 메서드를 선언하는 케이스
	public String information()
	{
		// 가능하긴 한데, 존나 비효율적인 방법
//		return String.format("%s, %s, %s, %d, %b", getBrand(), getpCode(), getpName(), getPrice(), allInOne);
		
		// 만약 그냥 information()을 호출하게 되면 가장 가까운 메서드, 즉 자기 자신의 information의 우선순위가 가장 높기 때문에 자기 메서드를 가리키게 되어버림
		// 따라서 자식 클래스의 메서드와 부모 클래스의 메서드의 이름이 동일할 때 super 등의 식별자를 붙여서 정확한 위치(주소)를 가리킬 필요가 있음
		return super.information() + String.format(", %b", allInOne);
	}
	
}
