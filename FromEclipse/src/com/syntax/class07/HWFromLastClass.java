package com.syntax.class07;

import java.util.Scanner;

public class HWFromLastClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Please enter two different numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result;
		System.out.println("Please enter your operator");
		String operator = scan.next();
		switch(operator) {
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
		default:
			result = 0;
		}
		
		//add a if condition if result is 0 so it wont print
		
		if( result != 0) {
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}
		
	}
		
		
		
		

	}


