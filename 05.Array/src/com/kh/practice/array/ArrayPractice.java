package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice 
{
	Scanner sc = new Scanner(System.in);
	
	public void practice1()
	{
		/*
		 * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
		 * 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		 * 
		 * ex)
		 * 10 9 8 7 6 5 4 3 2 1 
		 */
		
		int arr[] = new int[10];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = arr.length - i;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public void practice2()
	{
		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
		 * 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		 * 
		 * ex)
		 * 양의 정수 : 5
		 * 1 2 3 4 5 
		 */
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice3()
	{
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		 * 
		 * ex)
		 * 9 7 6 2 5 10 7 2 9 6 
		 */
		
		int arr[] = new int[10];
		
		for (int i = 0; i < arr.length; i++)
		{
			int j = (int)(Math.random() * 10 + 1);
			arr[i] = j;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice4()
	{
		/*
		 * “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		 * 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		 * 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		 * 
		 * 0 ~ 6 사이 숫자 입력 : 4
		 * 금요일
		 * 
		 * 0 ~ 6 사이 숫자 입력 : 7
		 * 잘못 입력하셨습니다.
		 */
		String arr[] = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if (num >= 7)
		{
			System.out.println("잘못 입력하셨습니다");
		}
		else
		{
			System.out.printf("%s요일\n", arr[num]);
		}
	}
	
	public void practice5()
	{
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		 * 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 * 
		 * ex)
		 * 정수 : 5
		 * 배열 0번째 인덱스에 넣을 값 : 4
		 * 배열 1번째 인덱스에 넣을 값 : -4
		 * 배열 2번째 인덱스에 넣을 값 : 3
		 * 배열 3번째 인덱스에 넣을 값 : -3
		 * 배열 4번째 인덱스에 넣을 값 : 2
		 * 4 -4 3 -3 2
		 * 총 합 : 2
		 */
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int arr[];
		
		int result = 0;
		
		if (num <= 0)
		{
			System.out.println("양수를 입력해주세요");
		}
		else
		{
			arr = new int[num];
			
			for (int i = 0; i < arr.length; i++)
			{
				System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
				int j = sc.nextInt();
				
				result += j;
				arr[i] = j;
				System.out.println();
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.println(String.format("총 합 : %d", result));
		}
	}
	
	public void practice6()
	{
		/*
		 * 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		 * 문자의 개수와 함께 출력하세요.
		 * 
		 * ex)
		 * 문자열 : application
		 * 문자열에 있는 문자 : a, p, l, i, c, t, o, n
		 * 문자 개수 : 8
		 */
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char arr[] = str.toCharArray();
		
		int count = 0;
		
		System.out.print("문자열에 있는 문자 : ");
		
		for (int i = 0; i < arr.length; i++)
		{
			// 중복인지 검사하고자 하는 문자
			char ch = arr[i];
			
			// 문자 중복 검사
			// 현재 위치에서 앞 쪽의 단어들 중 현재 단어와 일치하는 값이 있는지 확인
			boolean isDup = false;
			
			for (int j = 0; j < i; j++)
			{
				if (ch == arr[j])
				{
					// 중복
					isDup = true;
					break;
				}
			}
			
			if (!isDup)
			{
				count++;
				System.out.print(ch + " ");
			}
		}
		
		System.out.println("\n문자 개수 : " + count);
		
	}
	
	public void practice7()
	{
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		 * 
		 * ex)
		 * 문자열 : application
		 * 문자 : i
		 * application에 i가 존재하는 위치(인덱스) : 4 8
		 * i개수 : 2
		 */
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char arr[] = new char[str.length()];
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++)
		{
			arr[i] = str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ", str, ch);
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == ch)
			{
				System.out.print(i + " ");
				count++;
			}
		}
		
		System.out.println();
		System.out.printf("%s개수 : %d", ch, count);	
	}
	
	public void practice8()
	{
		/*
		 * 주민등록 번호 성별자리 이후부터 *로 가리고 출력하세요.
		 * 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		 * 
		 * ex)
		 * 주민등록 번호(-포함) : 123456-1234567
		 * 123456-1******
		 */
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		
		char arr[] = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++)
		{
			if (i < 8)
			{
				arr[i] = str.charAt(i);
			}
			else
			{
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}
	}
	
	public void practice9()
	{
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		 * 
		 * ex) 
		 * 5 3 2 7 4 8 6 10 9 10
		 * 최대값 : 10
		 * 최소값 : 2
		 */
		
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] < min)
			{
				min = arr[i];
			}
			else if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println();
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}
	
	public void practice10()
	{
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		 * 
		 * ex)
		 * 4 1 3 6 9 5 8 10 7 2 
		 */
		
		int arr[] = new int[10];
		int cur = 0;
		
		while (cur < 10)
		{
			int num = (int)(Math.random() * 10 + 1);
			
			if (cur == 0)
			{
				arr[cur] = num;
				System.out.print(arr[cur] + " ");
				cur++;
			}
			else
			{
				boolean isTrue = false;
				for (int i = 0; i < cur; i++)
				{
					if (arr[i] == num)
					{
						isTrue = false;
						break;
					}
					else
					{
						isTrue = true;
					}
				}
				if (isTrue)
				{
					arr[cur] = num;
					System.out.print(arr[cur] + " ");
					cur++;
				}
			}
		}
	}
	
	public void practice11()
	{
		/*
		 * 3 이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		 * 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		 * 다시 정수를 받도록 하세요.
		 *
		 *ex)
		 *정수 : 4
		 *다시 입력하세요.
		 *
		 *정수 : -6
		 *다시 입력하세요.
		 *
		 *정수 : 5
		 *1, 2, 3, 2, 1
		 */
		
		while (true)
		{
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			int arr[] = new int[num];
			
			if (num % 2 == 0 || num < 3)
			{
				System.out.println("다시 입력하세요.");
			}
			else
			{
				for (int i = 0; i < arr.length; i++)
				{
					if (i < (arr.length / 2 + 1))
					{
						arr[i] = i + 1;
						System.out.print(arr[i] + " ");
					}
					else
					{
						arr[i] = arr.length - i;
						System.out.print(arr[i] + " ");
					}
				}
			}
			System.out.println();
		}
	}
	
	public void practice12()
	{
		/*
		 * 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		 * 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		 * 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		 * 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		 * 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		 * 
		 * ex)
		 * 배열의 크기를 입력하세요 : 3
		 * 1번째 문자열 : 자바의 정석
		 * 2번째 문자열 : 알고리즘
		 * 3번째 문자열 : C프로그래밍
		 * 더 값을 입력하시겠습니까?(Y/N) : y
		 * 더 입력하고 싶은 개수 : 2
		 * 4번째 문자열 : 인간관계
		 * 5번째 문자열 : 자기계발
		 * 더 값을 입력하시겠습니까?(Y/N) : y
		 * 더 입력하고 싶은 개수 : 1
		 * 6번째 문자열 : 영단어600
		 * 더 값을 입력하시겠습니까?(Y/N) : n
		 * [자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
		 */
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		int count = 1;
		
		String arr1[] = new String[num1];
		
		for (int i = 0; i < arr1.length; i++)
		{
			
			System.out.printf("\n%d번째 문자열 : ", i);
			String str = sc.next();
			
			arr1[i] = str;
		}
		
		while (true)
		{			
			System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
			char ch = sc.next().charAt(0);
			
			if (ch == 'Y' || ch == 'y')
			{
				count++;
				System.out.print("더 입력하고 싶은 개수 : ");
				int num2 = sc.nextInt();
				
				num1 += num2;
				
				String arr2[] = new String[num1];
				
				for (int i = 0; i < arr2.length; i++)
				{
					if (i < arr1.length)
					{
						arr2[i] = arr1[i];
					}
					else
					{
						System.out.printf("%d번째 문자열 : ", i);
						String str = sc.next();
						
						arr2[i] = str;
					}
				}
				
				// 얕은 복사를 통해 arr1이 arr2의 주소를 참조하도록 함
				arr1 = arr2;
			}
			else
			{
				System.out.println(Arrays.toString(arr1));
				break;
			}
		}
	}
}
