package com.syntax.class14;

public class HW2 {
	/*
	 * Write a program that reads two people's first
	names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
	 */
	
	String babyNameGenerator(String person1, String person2, String gender) {
		if(gender.equalsIgnoreCase("b")) {
		return  person1.substring(0,3)+person2.substring(2,4 );
		}
		else if(gender.equalsIgnoreCase("g")) {
			return  person2.substring(0,2)+person1.substring(3,6 );
		} else {
			return "Invalid input";
		}
	}
}
	


