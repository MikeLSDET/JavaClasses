package com.syntax.class05Asel;

import java.util.Scanner;

public class NestedIfRecap {

	public static void main(String[] args) {
		
		
		/*
		 * write a program to ask if user got a visa
		 * 
		 * If user got a visa lets ask how long is visa for
		 * 
		 * if visa  more than1 year--> cool
		 * if less--> you will have to back in 1 year and to apply again
		 * 
		 */
		
		Scanner scan;
		String visa;
		int years;
		
		 scan=new Scanner (System.in);
		System.out.println("Hey, did you get your visa");
		
		visa=scan.nextLine();
		if (visa.equals("yes")) {
			System.out.println("Congratulations, how long is your visa for");
			years=scan.nextInt();
			
			if(years>1) {
				System.out.println("That is awesome");
			}else {
				System.out.println("you will have to back in 1 year and to apply again");
			}
		}
		
		
		
		
		
	}

}
