package com.kh.run;

import com.kh.chap01.condition.A_If;
import com.kh.chap01.condition.B_Switch;
import com.kh.chap02.loop.A_For;
import com.kh.chap02.loop.B_While;
import com.kh.chap03.breanch.A_Break;
import com.kh.chap03.breanch.B_Continue;

public class Run 
{
	public static void main(String[] args) 
	{
		A_If ifA = new A_If();
		
		// ifA.method();
		// ifA.method2();
		// ifA.method3();
		// ifA.method4();
		// ifA.method5();
		// ifA.method6();
		
		B_Switch switchB = new B_Switch();
		
		// switchB.method1();
		// switchB.method2();
		
		A_For forA = new A_For();
		
		// forA.method1();
		// forA.method2();
		// forA.method3();
		// forA.method4();
		// forA.method5();
		// forA.method6();
		// forA.method7();
		// forA.method8();
		// forA.method9();
		
		B_While whileB = new B_While();
		
		// whileB.method1();
		// whileB.method2();
		// whileB.method3();
		// whileB.method4();
		// whileB.method5();
		
		A_Break breakA = new A_Break();
		
		// breakA.method1();
		// breakA.method2();
		// breakA.method3();
		
		B_Continue continueB = new B_Continue();
		
		// continueB.method1();
		continueB.method2();
		
	}
}
