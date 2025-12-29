package com.kh.array;

import java.util.Arrays;

public class C_DimensionalArray 
{
	public void method1()
	{
		/*
		 * 2차원 배열 선언
		 * 
		 * [표현법]
		 * 1. 자료형 배열명[][];
		 * 2. 자료형[][] 배열명;
		 * 3. 자료형[] 배열명[];
		 */
		
		int arr1[][];
		int[][] arr2;
		int[] arr3[];
		
		/*
		 * 2차원 배열 할당(배열 크기 지정)
		 * 배열명 = new 자료형[행 크기][열 크기];
		 */
		
		arr3 = new int[2][3];
		
		// 2차원 배열 선언과 초기화를 동시에
		int arr[][] = new int[2][3];
		
		// 중첩 반복문을 이용한 2차원 배열 순회
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void method2()
	{
		/*
		 * 1행 [1, 2, 3, 4, 5]
		 * 2행 [6, 7, 8, 9, 10]
		 * 3행 [11, 12, 13, 14, 15]
		 * 2차원 배열을 선언 및 할당하고, 위 데이터 형식으로 초기화 하시오.
		 */
		
		int arr1[][] = new int[3][5];
		
		int num = 1;
		
		// 초기화
		for (int i = 0; i < arr1.length; i++)
		{
			for (int j = 0; j < arr1[i].length; j++)
			{
				arr1[i][j] = num;
				num++;
			}
		}
		
		// 출력
		for (int i = 0; i < arr1.length; i++)
		{
			for (int j = 0; j < arr1[i].length; j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		// 출력2
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println(Arrays.toString(arr1[i]));
		}
	}
	
	public void method3()
	{
		// 배열 선언 및 할당과 초기화
		int arr1[] = {1, 2, 3, 4, 5};
		
		int arr2[][] = {
				{1, 2, 3, 4, 5}, 
				{6, 7, 8, 9, 10}, 
				{11, 12, 13, 14, 15}
				};
		
		// 가변 배열
		// - 행의 크기는 정해져 있으나, 행 별 열의 개수가 정해지지 않은 배열을 의미함.
		// - 2차원 배열은 1차원 배열을 여러 개 묶음으로 관리하는 형태이긴 하지만,
		// 1차원 배열의 크기가 꼭 같을 필요는 없음!!
		
		int arr3[][] = new int[3][];
		
		System.out.println(arr3[0]);	// null
		
		arr3[0] = new int[2];
		arr3[1] = new int[5];
		arr3[2] = new int[3];
	}
	
	public void method4()
	{
		/*
		 * char[][] 가변 배열을 생성 후 문자를 저장하시오.
		 * 
		 * 최종 출력 형태
		 * 1행 [a, b, c]
		 * 2행 [d, e]
		 * 3행 [f, g, h, i]
		 */
		
		char arr[][] = new char[3][];
		
		arr[0] = new char[3];
		arr[1] = new char[2];
		arr[2] = new char[4];
		
		char ch = 'a';
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = ch;
				ch++;
			}
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
