package com.kh.practice.lambda;

public class LambdaPractice4 
{
	public static void main(String[] args) 
	{
		MyFunction2<String, Integer> printer = (name, score) -> 
		{
			String result = ""; 
			switch (score / 10)
			{
			case 10: case 9:
				result = "A";
				break;
				
			case 8:
				result = "B";
				break;
				
			case 7:
				result = "C";
				break;
				
			case 6:
				result = "D";
			
			default:
				result = "D";
			}
			
			System.out.println(String.format("%s님의 점수는 %s학점(%d)입니다.", name, result, score));
		};
		
		
		printer.accept("홍길동", 95);
		printer.accept("이순신", 88);
	}
	
	@FunctionalInterface
	interface MyFunction2<K, A>
	{
		void accept(K k, A a);
	}
}
