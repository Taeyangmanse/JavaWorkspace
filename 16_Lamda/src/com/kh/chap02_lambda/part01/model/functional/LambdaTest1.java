package com.kh.chap02_lambda.part01.model.functional;


/*
 * 함수형 인터페이스
 * - 내부적으로 반드시 1개의 추상 메서드만 존재해야 한다.
 * 
 */

@FunctionalInterface
public interface LambdaTest1 
{
	// 함수형 인터페이스에서는 한 개의 코드만 동작 가능함
	int add(int x, int y);
}
