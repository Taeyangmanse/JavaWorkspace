package com.kh.practice.lambda;

import java.util.function.BiFunction;

public class LambdaPractice5 
{
	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> op = getOperator("+");
		System.out.println(op.apply(10, 5));
		
		op = getOperator("*");
		System.out.println(op.apply(10, 5));
	}
	
	public static BiFunction<Integer, Integer, Integer> getOperator(String type)
	{
		switch (type) 
		{
		case "+":
			return (a, b) -> a + b;
		case "-":
			return (a, b) -> a - b;
		case "*":
			return (a, b) -> a * b;
		case "/":
			return (a, b) -> a / b;
		case "%":
			return (a, b) -> a % b;
		default:
			return null;
		}
	}
}
