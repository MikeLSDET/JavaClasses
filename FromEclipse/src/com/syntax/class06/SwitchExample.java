package com.syntax.class06;

public class SwitchExample {

	public static void main(String[] args) {
		
		
		char gender='O';
		
		switch(gender) {
		case 'M':
			System.out.println("male");
			break;
		case 'F':
			System.out.println("female");
			break;
			default:
				System.out.println("gender is unknown");
		}
		System.out.println("-----LIMITATIONS-----");
		
		// CANNOT BE USED WITH BOOLEAN TYPS OF VALUES
		// DOES NOT ALLOW DOUBLE, FLOAT, LONG TYPES OF VALUES
		// CANNOT USED RELATIONAL OPERATORS NOR LOGICAL OPERATORS
	
	}

}
