package com.syntax.class04;

public class NestedIfStatement {

	public static void main(String[] args) {

		// Nested if: inside first if
		/*
		 * if (boolean condition){ code.... if (boolean condition) { } }
		 */

		// Outer if must be true in order for nested if to be read/executed, if not JAVA
		// will skip whole block code
		boolean vaccine = true;

		boolean secondDose = true;

		// outer if
		if (vaccine) {// yes
			System.out.println("Let's check how many doses you got");
			if (secondDose) {// nested if, outer if must be true for nested if to be executed
				System.out.println("You are fully vaccinated");
			} else {
				System.out.println("You will need to get a 2nd dose.");
			}

			System.out.println("End of outer if block");
		}
		
		System.out.println("----ANOTHER EXAMPLE OF NESTED IF-------");
		
		/*
		 * Every friday is movie day
		 * if it is the 13th--> you want to watch a scary movie
		 */
		int day=13;
		boolean isFriday=true;		
		
		if (isFriday) {
			System.out.println("I am going to watch a movie");
			
			if (day==13) {
				System.out.println("Yay, I am watching scary movie");
			}else {
				System.out.println(" I am watching whatever is poular");
			}
		}else {
			System.out.println(" I am going to study");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("End of the code");
	}

}
