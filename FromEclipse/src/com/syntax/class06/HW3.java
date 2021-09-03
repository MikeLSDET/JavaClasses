package com.syntax.class06;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {

		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner in = new Scanner(System.in);
		String operator;

		System.out.println("Welcome to your calculator please enter 2 numbers ");

		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int result = 0;

		System.out.println("nice now pick a operator");
		System.out.println("choose from +,/,-,*");
		operator = in.next();
		System.out.println("you chose " + operator);

		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;

		}
		System.out.println("Your result is " + (result));

	}

}
