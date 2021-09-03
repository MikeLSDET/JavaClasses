package com.syntax.class04;

public class Task {
	public static void main (String[]args) {
		
		
		boolean haveDiploma=true;
		double gpa=3.5;
		if(haveDiploma) {
			System.out.println("Congratulations");
			if(gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
				}else {
					System.out.println("You should have studied harder");
				}
			}
		else {
				System.out.println("Get a degree");
			}
	}

}
