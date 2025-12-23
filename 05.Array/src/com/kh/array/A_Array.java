package com.kh.array;

public class A_Array 
{
	/*
	 * 변수 : 하나의 공간에 하나의 값을 저장할 수 있는 저장공간
	 * 
	 * 배열 : 하나의 공간에 여러 개의 값을 담을 수 있다.
	 * (같은 자료형 기준)
	 * 
	 * [표현법]
	 * 방법 1) int[] a = new int[3];
	 * 방법 2) int a[] = new int[3];
	 */
	
	public void method1()
	{
		int a;
		int arr[];
		int[] arr2;
		
		/*
		 * 배열 할당
		 * - 이 배열에 몇 개의 값들을 보관할 건지, 그 배열의 크기를 지정해 주는 과정
		 * - 크기를 지정해주면, 지정한 갯수만큼의 저장공간을 가진 배열이 생성
		 */
		
		arr = new int[3];	// 할당 완료
		int[] arr3 = new int[5];
		
		System.out.println(arr3[0]);
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(arr);	// 참조형 변수의 이름은 주소를 의미함
		// 자바에는 역참조 연산자가 없음
	}
	
	public void method2()
	{
		int num = 10;
		
		int arr[] = new int[5];
		
		System.out.println("arr : " + arr);	// 배열에 저장된 값이 아닌 주소값이 나옴
		System.out.println("arr의 HashCode : " + arr.hashCode());
		// 주소값을 10진수 형태로 변경해주는 함수
		
		
	}
}
