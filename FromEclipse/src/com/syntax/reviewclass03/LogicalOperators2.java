package com.syntax.reviewclass03;

public class LogicalOperators2 {

	public static void main(String[] args) {

		/*
		 * 
		 * if a number is from 0 to 100 print number is in range else print numbere is
		 * out of range
		 * 
		 * 
		 * 
		 */
		int number = -10;

		if (number >= 0) {
			if (number <= 100) {
				System.out.println("number is in range");

			} else {
				System.out.println("number is out range");
			}

		} else {
			System.out.println("number is out range");
		}

		if (number >= 0 && number <= 100) {
			System.out.println("number is in range");
		} else {
			System.out.println("number is out of range");
		}

	}

}
