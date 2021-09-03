package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		//Task print numbers from 1 to 50 except those that are divisible by 3
		
		for(int i=1; i<=50; i++) {
			
			if(i % 3==0) {
				continue;
			}System.out.println(i);
			
		}
		
		
		//task2 Create a program that will keep asking user to apply for a credit card. 
		//As soon you get “yes” from a user program should stop asking.
		
		Scanner in=new Scanner (System.in);
		String answer;
		
		do {
		System.out.println("Please apply for a credit card");
		answer=in.nextLine();
		
		}while(!answer.equals("yes"));
		
		
		//ifignore casing use equalsIgnoreCase
		
		
		
	
	}
}
