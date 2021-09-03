package com.syntax.reviewclass02;

public class TypeCasting {

	public static void main(String[] args) {
		
		double number1=20.6;
		int number2=(int)number1;
		System.out.println(number2);//20 narrowing/explicit, needs to be done manually
		
		number2=45;
		number1=number2;
		System.out.println(number1);//45.0 widening/implicit, happens automatically
		
		int number3=10;
		int number4=4;
		System.out.println(number3/number4);
		
		double number5=10;
		double number6=4;
		System.out.println(number5/number6);
		System.out.println(10.0/4);//since 10.0 is there the 4 becomes 4.0 (widening) thats why output is 2.5
		
		
		
		
	}

}
