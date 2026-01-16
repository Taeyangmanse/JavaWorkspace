package com.kh.chap02_lambda.part02_practice;

import com.kh.chap02_lambda.part01.model.functional.LambdaTest1;
import com.kh.chap02_lambda.part01.model.functional.LambdaTest2;

public class LambdaPractice 
{
	public static void main(String[] args) 
	{
		// 람다식 문법
		// 1. 기본 형태
		LambdaTest1 lmd1 = (x, y) -> { return x + y; };
		
		// 2. 매개 변수의 자료형은 생략 가능
		lmd1 = (x, y) -> { return x - y; };
		
		// 3. 매개 변수의 () 생략 가능
		// 단, 매개변수가 딱 1개 있는 경우만
		LambdaTest2 lmd2 = x -> { System.out.println(x); };
		
		lmd2.print("람다");
		
		// 4. 중괄호 생략 가능
		// 단, 실행할 코드가 한 문장인 경우
		lmd2 = x -> System.out.println(x);
		
		lmd2.print("빈약하노");
		
		
		// 5. 리턴 생략 가능
		lmd1 = (x, y) -> x + y;
		System.out.println(lmd1.add(5, 4));
		
		
		// ============= 실습 문제 =================
		// - 실습문제 -
        // 각 람다식을 가장 간결한 형태로 표현하기
        // 1. ((int x) -> { return (x * x); });
		// 답 : x -> x * x;
		
        // 2. (String str) -> { return (str.length()); };
		// 답 : str -> str.length();
		
        // 3.  (int x) -> { System.out.println(x); return x; };
		// 답 : x -> { System.out.println(x); return x; };
		
        // 4. (String str) -> { return (str.toUpperCase()); };
		// 답 : str -> str.toUpperCase();
		
        // 5. (int x , int y) -> { return (x * y); };
		// 답 : (x, y) -> x * y;
		
        // 6. ((int x , int y) -> { return (x % y == 0); });
		// 답 : (x, y) -> x % y == 0;
		
        // 7. (int x , String str1) -> { return (str1 + x); };
		// 답 : (x, str1) -> str1 + x;
		
        // 8. ((int x , String str1) -> { System.out.println(x + str1); });
		// 답 : (x, str1) -> System.out.println(x + str1);
		
        // 9. (int[] arr) -> { return (Math.max(Math.max(arr[0], arr[1]), arr[2])); };
		// 답 : arr -> Math.max(Math.max(arr[0], arr[1]), arr[2]);
		
        // 10. ((String str1, String str2) -> { String result =  (str1.conact(str2)); return result; });
		// 답 : (str1, str2) -> { String result = str1.conact(str2); return result; });
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


































