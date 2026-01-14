package com.kh.chap04_sync.run;

import com.kh.chap04_sync.sync.ATM;
import com.kh.chap04_sync.sync.Account;

public class Run
{
	public static void main(String[] args) 
	{
		/*
		 * 동기화
		 * - 멀티 스레드 프로그래밍에서 스레드 간에 "경쟁 상태"에 있는 공유 자원에 대한 
		 * "접근 순서(임계 영역)"을 지정해 주는 것
		 * - 멀티 스레드 프로그래밍에서 여러 스레드가 동시에 하나의 자원에 접근하는 상황을 
		 * "경쟁 상태"라고 부른다.
		 * 즉, 자원을 차지하기 위해 경쟁 하는 것
		 * - 이를 방지하기 위해 하나의 공유자원에 접근할 때는 하나의 스레드만 접근할 수 있도록
		 * 통제해야 하는데, 통제 하기 위해 해당 자원을 "통제 영역(임계 영역)"으로 지정하고,
		 * 통제 영역을 지정하는 키워드가 바로 동기화(Synchronized)이다.
		 * 
		 * 
		 */
		
		Account acc = new Account();
		
		Thread atm1 = new Thread(new ATM(acc), "ATM 1");
		Thread atm2 = new Thread(new ATM(acc), "ATM 2");
		
		
		atm1.start();
		atm2.start();
	}
}


















