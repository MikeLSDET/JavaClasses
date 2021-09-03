package com.syntax.class07;

public class DoWhileLoop {

	public static void main(String[] args) {

		int i = 1;
		// while checks condition first then if true executes code
		while (i <= 3) {
			System.out.println("Hello");
			i++;
		}

		System.out.println("--------do while example below --------");

		int j = 1;
		// do while lets you execute the code before checking the condition
		do {

			System.out.println("Hello");
			j++;
		} while (j >= 3);

		System.out.println("   --------------------------------------      ");

		// print numbers from 1 until 10 using do while loop

		int n = 1;

		do {

			System.out.println(n);
			n++;
		} while (n <= 10);
		
		
		
	}
}
