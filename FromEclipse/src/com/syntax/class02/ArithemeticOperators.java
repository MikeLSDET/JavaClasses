package com.syntax.class02;

public class ArithemeticOperators {

	public static void main(String[] args) {
		
		/*
		 *  +, -, *, /, %
		 */
		int num1=90;
		int num2=10;
		
		//shortcut for print system is syso+ctrl+space
		//using plus sign between two number actaully adds them like in math, since no string.
		
		System.out.println(num1+num2);//90+1=100
		System.out.println(num1-num2);//90-10=80
		System.out.println(num1*num2);//90*10=900
		System.out.println(num1/num2);//90/10=9
		
		int sum=num1+num2;
		System.out.println(sum);
		
		int sub=num1-num2;
		System.out.println(sub);
		
		double n1=2.99;
		double n2=3.05;
		
		
		double total=n1+n2;
		System.out.println(n1+n2);
		
		double resultOfDivision=n1/n2;
		
		System.out.println(resultOfDivision);//0.9803278688524591 more accuracy
		
		
		float f1=2.99f;
		float f2=3.05f;
		
		
		float floatDivision=f1/f2;
		System.out.println(floatDivision);//0.9803279
		
		//modulus (%) gives the remainder 
		
		int number1, number2, mod;
		number1=10;
		number2=6;
		
		mod=number1%number2;
		
		System.out.println(mod);
		
		//what is the result for(below)?
		
		int guess;//declared variable
		
		guess=20+20*2;// assigned value
		System.out.println(guess);
		
		
		guess=2*2+(4+10);//reassigned value to variable(guess)
		System.out.println(guess);
		
		
		
		
		
		
				
		
		
		
	}

}
