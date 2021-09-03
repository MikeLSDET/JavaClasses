package com.syntax.class08;

import java.util.Scanner;

public class Task3 {
 
	public static void main (String[]args) {
		
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		 * If user give more money program should return a change.
		 *  Whenever a user done with payments program should say “Thank you for shopping!”
		 */
		
		Scanner in=new Scanner (System.in);
		
		String item;
		int price,money,balance=0 ;
		
		
		System.out.println("Please enter which item you would like to buy and the price of it");
		item=in.next();
		price=in.nextInt();
		
		do {
			System.out.println("Please enter/give the money for your item");
			money=in.nextInt();
			
			balance+=money;
			
			
			if(balance<price) {
				System.out.println("Your balance due is "+(price-money));
				
				
			}else if(balance>price) {
				System.out.println("Your Change is "+(money%price));
			}
			
		}while (balance!=price);
		
		System.out.println("“Thank you for shopping!”");
		
		
	}
}
