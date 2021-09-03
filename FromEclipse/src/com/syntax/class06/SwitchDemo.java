package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		//"if"  statement is a condition(true/false) based statement
		//if else if else is like a ladder/stairs
		
		
		//"switch" is a value based statement. It finds matching value case and jumps right away
		//switch is like an elevator
		//Using switch statement
		/*
		 * in switch always remember:
		 * 
		 * Always use break; --> to stop and get out of from switch block
		 * variable type and case values MUST be of same datatype
		 * 
		 * 
		 * default:-->is optional just like "else" in if statements
		 */
		int day=4;
		String dayName;
		
		
		
		switch(day) {
		
		
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
			
		case 3:
			dayName="Wednesday";
			break;
		case 4:
			dayName="Thursday";
			break;
			
		case 5:
			dayName="Friday";
			break;
			
		case 6:
			dayName="Saturday";
			break;
			
		case 7:
			dayName="Sunday";
			break;
			
			default:
				dayName="invalid";
			break;
		}

		System.out.println("today is "+dayName);
	}

}
