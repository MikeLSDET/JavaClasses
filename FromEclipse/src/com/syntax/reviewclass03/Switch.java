package com.syntax.reviewclass03;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//use switch case when possible
		
		System.out.println("Enter two numbers");
		Scanner scanner=new Scanner(System.in);
		double number1=scanner.nextDouble();
		double number2=scanner.nextDouble();
		System.out.println("Enter the operation");
		char operation=scanner.next().charAt(0);//youre telling the char operator to only take the 1st character, if you put one it will take the 2nd character
		
		if(operation=='+') {
			System.out.println(number1+number2);
		}else if (operation=='-') {
			System.out.println(number1-number2);
		}else if(operation=='*') {
			System.out.println(number1*number2);
		}else if(operation=='/') {
			System.out.println(number1/number2);
			
		}else {
			System.out.println("Operation not supported");
		}
		
		switch(operation) {
		case'+':
			System.out.println(number1+number2);
			break;
		case'-':
			System.out.println(number1-number2);
			break;
		case'*':
			System.out.println(number1*number2);
			break;
		case'/':
			System.out.println(number1/number2);
			break;
			default:
				System.out.println("Operation not supported");
		}
		
		
		
		
		
		
		
	}

}
