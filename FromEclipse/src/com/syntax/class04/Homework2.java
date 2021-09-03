package com.syntax.class04;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[]args) {
		
		/*
		 * You are DMV representative and you need to ask customer their age.
		 *  If they are 18 and older you will issue a driver license to them, otherwise you will offer them to get a learners permit.
		 */
		
		Scanner age=new Scanner (System.in);
		
		System.out.println("Hello, How old are you?");
		int num1=age.nextInt();
		if(num1>=18) {
			System.out.println("We are able to issue you a driver's license");
			
			
		}else {
			System.out.println("Unfortunately, we are not able to issue you a driver's license");
		}
	
		
		
	}

}
