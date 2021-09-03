package com.syntax.class05Asel;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * 
		 * 2. Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =“Summer”.
At the end of the program we should see output as “You were born is season ______“.

		 */
		
		Scanner data=new Scanner (System.in);
		
		
		
		
		System.out.println("Please enter the month you were born");
		
		String month=data.nextLine();
		String season =null;
		
		
		if(month.equals("June") || month.equals("July") || month.equals("August")) {
			if (month==month){
				System.out.println(season="summer");
			}
			}else if(month.equals("September")||month.equals("October")|| month.equals("November")) {
				if(month==month) {
					System.out.println(season="fall");
				}
			}else if (month.equals("December")|| month.equals("January")||month.equals("February")) {
				if(month==month) {
					System.out.println(season="winter");
				}
			} else if(month.equals("March")||month.equals("April")||month.equals("May")) {
				if(month==month) {
					System.out.println(season="spring");
				}
			}
			System.out.println("You were born in season " +season);
		
		
		
		
		

	}

}
