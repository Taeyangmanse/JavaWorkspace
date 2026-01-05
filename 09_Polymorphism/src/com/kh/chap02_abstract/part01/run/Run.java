package com.kh.chap02_abstract.part01.run;

import com.kh.chap02_abstract.part01.model.vo.*;

public class Run 
{
	public static void main(String[] args) 
	{
		// 추상 클래스로 객체 생성?
		// - 추상 클래스는 객체 생성이 불가능
		// -> 내부에 실행할 수 없는 미구현된 메서드가 존재하기 때문
		// Sports s = new Sports;
		
		// 단, 참조 변수로는 사용이 가능하다. (다형성 때문)
		Sports s = new BasketBall();
		
		Sports[] arr = new Sports[2];
		arr[0] = s;
		arr[1] = new FootBall();
		
		for (Sports spo : arr)
		{
			spo.rule();
		}
		
		/*
		 * 추상 클래스 정리
		 * : 추상 클래스란, 미완성된 부분이 존재하는 클래스임을 의미(abstract class)
		 *  - 미완성된 클래스이기 때문에 객체 생성은 불가능하나, 참조 변수로는 사용이 가능하다.
		 *  - 추상 메서드가 포함된 경우, 클래스는 반드시 추상 클래스로 정의해야 한다.
		 *  - 추상 클래스는 "일반 필드", "일반 메서드", "생성자", "추상 메서드"로 이루어져 있다.
		 *  - 추상 클래스는 클래스의 상속이 주된 목적이며, 메서드 강제 구현은 부수 목적이다.
		 *  
		 * 추상 메서드 정리
		 * : 미완성된 메서드를 의미하며, 메서드의 몸통부가 구현되어 있지 않은 메서드
		 *  - 상속받은 추상 메서드를 재정의하지 않는 경우 에러가 발생한다.
		 *  - 추상 메서드를 통해 클래스 간의 통일성을 확보할 수 있다.
		 */
	}
}
