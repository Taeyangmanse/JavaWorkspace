package com.kh.practice.lambda;

public class LambdaPractice2 
{
	public static void main(String[] args)
	{
		Calculator<Integer> adder = (x, y) -> x * y;
//		Calculator<Integer> findMax = (x, y) -> Math.max(x, y);
		Calculator<Integer> findMax = Math::max;
		Calculator<String> combiner = (a, b) -> a + "-" + b;
		
		System.out.println(adder.operate(12, 3));
		System.out.println(findMax.operate(12, 3));
		System.out.println(combiner.operate("hello", "world"));
		
	}
	
	
	@FunctionalInterface
	interface Calculator<V> 
	{
		V operate(V v1, V v2);
	}
}
