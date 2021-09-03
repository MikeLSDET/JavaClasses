package com.syntax.class06;

import java.util.Scanner;

public class HW3If {

	public static void main(String[] args) {
		System.out.println("----------IF Statement task below----------");
		Scanner in = new Scanner(System.in);
		String operator=null;

		System.out.println("Welcome to your calculator please enter 2 numbers ");

		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int result=0;
		

		System.out.println("nice now pick a operator");
		System.out.println("choose from +,/,-,*");
		operator = in.next();

		

		if (operator.equals("+")) {

			result=num1+num2;
			
		} else if (operator.equals("-")) {
			result=num1-num2;
			
		} else if (operator.equals("*")) {

			result=num1*num2;
		} else if (operator.equals("/")) {
			result=num1/num2;
			
		}else {
			System.out.println("number is invalid");
		}System.out.println("The answer to your equation is "+(result));

	}

	}


