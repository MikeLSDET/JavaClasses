package com.syntax.class04;

import java.util.Scanner;

public class AnotherScanner {
	public static void main (String[]args) {
		
		
		Scanner scan=new Scanner (System.in);//importing scanner
		
		//let's capture first and last name
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		
		System.out.println("Please enter your last name");
		String lastName=scan.nextLine();
		
		System.out.println("please tell me  country  where you are from");
		String country=scan.nextLine();
		
		System.out.println(" Nice to mee you "+name+" "+lastName+" from "+country);
		
		/*
		 * next() - is used to capture a String value before space(takes the next word only): example United States would only capture United
		 * nextLine() = is used to capture a String value(full line including spaces) would capture United States normally
		 */
		
		
		
		
	}

}
