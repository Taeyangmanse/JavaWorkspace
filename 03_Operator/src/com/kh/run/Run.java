package com.kh.run;

import com.kh.operator.A_Arithmetic;
import com.kh.operator.B_Indecrease;
import com.kh.operator.C_Compound;
import com.kh.operator.D_Logical;
import com.kh.operator.F_Triple;
import com.kh.operator.Quiz;

public class Run 
{
	public static void main(String[] args) 
	{
		A_Arithmetic arithmetic = new A_Arithmetic();
		// arithmetic.method();
		
		B_Indecrease increase = new B_Indecrease();
		// increase.method1();
		// increase.method2();
		// increase.method3();
		// increase.method4();
		
		C_Compound compound = new C_Compound();
		// compound.method();
		
		D_Logical logical = new D_Logical();
		// logical.method4();
		
		F_Triple triple = new F_Triple();
		// triple.method1();
		// triple.method2();
		
		Quiz quiz = new Quiz();
		// quiz.quiz();
	}
}
