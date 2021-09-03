package com.syntax.class08;

import java.util.Scanner;

public class Task3Attempt2 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		 * If user give more money program should return a change.
		 *  Whenever a user done with payments program should say “Thank you for shopping!”
		 */
		
		
		
		Scanner scan=new Scanner (System.in);
		
		String item;
		double price,moneyGiven,change=0,balance=0, total=0;
		
		System.out.println("Which item would you like to buy?");
		item=scan.nextLine();
		System.out.println("What is the price of the item?");
		price=scan.nextDouble();
		
		System.out.println("Please give the money for your item.");
		moneyGiven=scan.nextDouble();
		
		balance=price=moneyGiven;
		
		do { 
			System.out.println("You have a balance, please give more money, your balance left is: "+balance);
		
			
			
			
		
			
			
			
			
		}while(total!=price);
		
		System.out.println("Thank you for shopping with us!");
		
	
		
		
		
		

	}

}
