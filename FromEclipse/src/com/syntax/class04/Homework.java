package com.syntax.class04;

import java.util.Scanner;

public class Homework {
	public static void main(String[]args) {
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		 */
		
		Scanner data=new Scanner(System.in);
		
		System.out.println("How big of a loan do you need?");
		int num1=data.nextInt();
		
		if(num1<=200000) {
			System.out.println("We will be able to offer you a loan");
		}else {
			System.out.println("Unfortunately we will not able to give you a loan");
		}
		
		
		
		
	}
}
	
