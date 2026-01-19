package com.kh.practice.lambda;

public class LambdaPractice3
{
	public static void main(String[] args) 
	{
		
		MyFunction<String, String> first = str -> str.toUpperCase();
		MyFunction<String, Boolean> second = str -> str.length() >= 5;
		MyFunction<String, String> third = str -> 
		{ 
			String str2 = "";
			for (int i = 0; i < str.length(); i++)
			{
				str2 += str.charAt(i);
				if (i != str.length() - 1)
				{
					str2 += "-";
				}
			}
			return str2;
		};
		
		System.out.println(first.apply("asdfasd"));
		System.out.println(second.apply("asdfasd"));
		System.out.println(third.apply("lambda"));
	}
	
	@FunctionalInterface
	interface MyFunction<V, B>
	{
		B apply(V v);
	}
	
	
}








