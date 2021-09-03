package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		String sale;
		double price=0;
		int discount = 0;
		double finalPrice;
		System.out.println("Is there a sale now?");
		sale= scan.nextLine();
		
		if(sale.equals("yes")) {
			System.out.println("what you would like to purchase?");
			String item = scan.nextLine();
			
			System.out.println("what is the price for item?");
			price = scan.nextDouble();
			
			if(price<20) {
				discount= 10;
				
			}else if (price>=20 && price<100) {
				discount = 20;
			}else if (price>=100 && price<500) {
				discount = 30;
			}else if (price>500) {
				discount= 50;
			}
			
			finalPrice=price-(price*discount/100);
			
			
			System.out.println("After the discount"+discount+"% the price of the"+item+" reduced from $"+price+" to $"+finalPrice);
			
			
		}else {
			System.out.println("Sorry , no shopping today");
		}
			
				
		
	}

}
