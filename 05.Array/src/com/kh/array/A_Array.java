package com.kh.array;

import java.util.Arrays;

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
	
	public void method3()
	{
		/*
		 * null은 모든 참조 자료형의 기본값이다.
		 * 단, 참조 변수가 null을 저장한 상태에서, 주소값이 있어야 수행할 수 있는 행위를 코드로 작성하면 실행 시 에러가 발생한다.
		 */
		
		int result = 0;
		String str = null;
		int arr[] = null;
		
		// System.out.println(arr.length);
		// System.out.println(arr[0]);
	}
	
	public void method4()
	{
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 5;
		 * arr[3] = 6;
		 * arr[4] = 10;
		 * 
		 * 1. 반복문을 활용하여 배열 초기화하기
		 * 
		 * 2. 초기화 완료된 배열을 반복문을 활용하여 내부에 저장된 값을 출력
		 * 출력 형식 : 10 8 6 4 2
		 */
		
		int arr[] = new int[5];
		
		int result = 2;
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = result;
			result += 2;
		}
		
		for (int i = arr.length-1; i >= 0; i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public void method5()
	{
		int arr[] = new int[5];
		
		// arr[5] = 12; -> error 발생!
		// 배열의 크기를 벗어난 인덱스 제시 시 에러 발생
		
		// 배열은 한번 지정한 크기를 변경할 수 없다.
		// 배열의 범위를 넘어선 값들을 저장하고자 한다면, 새로운 배열을 생성해야 한다.
		// (이건 자바만 그럼. 아니 이딴 언어가 존재한다고?? www 처역겹놐ㅋㅋㅋㅋ)
		
		arr = new int[6];
		arr[5] = 12;
		// 기존 0 ~ 4 번 인덱스의 값은 0을 저장하고 있는 상태,
		// 즉, arr라는 이름의 새로운 배열을 생성하는 것이지, 기존 arr 배열에 6번째 공간을 추가로 할당하는 것이 절대 아니다.
		// 즉!! 기존의 arr는 접근할 방법을 잃은 채로 메모리 상에서 공간만 차지하는 가비지 컬렉터가 되어버렸다.
		// 즉!!! 기존의 arr 배열의 값을 새로 생성한 6칸짜리 배열에 넣을 수도 없다.
		// 즉!!!! 자바는 개처역겨운 배열을 가지고 있다!!!
	}
	
	public void method6()
	{
		// 방법 1.
		int arr1[] = new int[] {1, 2, 3, 4, 5};
		
		// 방법 2.
		int arr2[] = {1, 2, 3, 4, 5};
	}
	
	public void method7()
	{
		// 문자열을 문자 배열로 만드는 방법
		String str = "merry";
		
		// 방법 1.
		// toCharArray() 함수 사용
		char[] arr = str.toCharArray();
		
		// 방법 2.
		// for문으로 문자 배열 생성하여 옮겨담기
		// 네? 문자열 자체가 이미 배열이 아니시라구요??? 이걸 이따구로 배열로 바꿔야 한다구요?????
		char[] arr2 = new char[str.length()];
		
		for (int i = 0; i < arr2.length; i++)
		{
			arr2[i] = str.charAt(i);
		}
		
		// Arrays.toString(배열) : 배열 내부의 값들을 문자열로 변환하여 반환하는 메서드
		System.out.println(Arrays.toString(arr));
		System.out.println(arr2);
		
		// 진짜 자바 배열 쳐역겹네 ㄷㄷ.... 이게 뭐냐.... 심연을 보았다....
	}
}
