package com.syntax.class06;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {

		// Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		// A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		// At the end your program should print which grade was entered by a user with
		// explanation.

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter your grade");
		String grade = in.nextLine();
		String explain;

		switch (grade) {
		case "A":
			explain = "Excellent";
			break;

		case "B":
			explain = "Good";
			break;
		case "C":
			explain = "Average";
			break;
		case "D":
			explain = "Bad";
			break;
		default:
			explain = "Not Acceptable";

		}
		System.out.println("Your grade is " + grade + " and that is " + explain);

	}

}
