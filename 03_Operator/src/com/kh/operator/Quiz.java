package com.kh.operator;

public class Quiz 
{
	public void quiz() 
	{
        int a = 5;
        int b = 10;
        int c = (++a) + b;	// 6 + 10 = 16
        int d = c / a;	// 16 / 6 = 2
        int e = c % a;	// 16 % 6 = 4
        int f = e++;	// 4(5)
        int g = (--b) + (d--);	// 9 + 2(1) = 11
        int h = 2;
        int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);	// 6(7) + 9 / (15 / 4) * (11(10) - 1) % (6 + 2) = 12
        
        System.out.println("a : "+a);	// 7
        System.out.println("b : "+b);	// 9
        System.out.println("c : "+c);	// 15
        System.out.println("d : "+d);	// 1
        System.out.println("e : "+e);	// 6
        System.out.println("f : "+f);	// 4
        System.out.println("g : "+g);	// 10
        System.out.println("h : "+h);	// 2
        System.out.println("i : "+i);	// 12
    }
}
