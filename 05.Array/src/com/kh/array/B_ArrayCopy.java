package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy 
{
	/*
	 * 배열 복사
	 * - 얕은 복사
	 * : 배열의 주소값만을 복사(즉, 동일한 공간을 가리키도록 하는 것)
	 * 
	 * 
	 * - 깊은 복사
	 * : 동일한 새로운 배열을 하나 생성하여 내부의 값들까지 복사하는 개념
	 */
	
	public void method1()
	{
		// 원본 배열
		int origin[] = {1, 2, 3, 4};
		
		System.out.println("원본 배열 출력");
		for (int i = 0; i < origin.length; i++)
		{
			System.out.print(origin[i] + " ");
		}
		
		// 얕은 복사
		int copy[] = origin;
		
		System.out.println();
		System.out.println("복사 배열 출력");
		for (int i = 0; i < copy.length; i++)
		{
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// 카피 배열 수정
		copy[2] = 99;
		
		// 수정한 값 출력
		for (int i = 0; i < copy.length; i++)
		{
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < origin.length; i++)
		{
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// 깊은 복사
		int copy2[] = new int[4];
		
		for (int i = 0; i < origin.length; i++)
		{
			copy2[i] = origin[i];
		}
		
		copy2[2] = 0;
		
		// 수정한 값 출력
		for (int i = 0; i < copy2.length; i++)
		{
			System.out.print(copy2[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < origin.length; i++)
		{
			System.out.print(origin[i] + " ");
		}
		System.out.println();
	}
	
	public void method2()
	{
		// 깊은 복사를 편리하게 할 수 있는 메서드 사용법
		// [사용 방법]
		// 새로운 배열을 생성한 후 System 클래스의 arraycopy를 이용한 복사
		
		int origin[] = {1, 2, 3, 4, 5};
		int copy[] = new int[10];
		
		// System.arraycopy(원본 배열, 원본 배열의 복사를 시작할 인덱스, 복사본 배열, 복사본 배열의 복사를 시작할 인덱스, 복사할 개수)
		
		// 0 0 1 2 3 4 5 0 0 0 
		// 0 1 2 3 0 0 0 0 0 0 
		// 0 3 4 5 0 0 0 0 0 0
		System.arraycopy(origin, 2, copy, 1, 3);
		
		System.out.println(Arrays.toString(copy));
		
	}
	
	public void method3()
	{
		// Arrays 클래스의 copyOf 메서드 사용
		
		// 원본 배열
		int origin[] = {1, 2, 3, 4, 5};
		
		// Arrays.copyOf(원본 배열명, 복사할 개수)
		int copy[] = Arrays.copyOf(origin, 5);
		
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		
		copy[2] = 10;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
	}
	
	public void method4()
	{
		// clone() 메서드를 사용한 복사
		int origin[] = {1, 2, 3, 4, 5};
		
		// 인덱스 지정, 복사할 개수 지정 X
		int copy[] = origin.clone();
		
		// 원본 배열과 정확히 똑같은 배열을 깊은 복사!!
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
		
		copy[2] = 10;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));
	}
}
