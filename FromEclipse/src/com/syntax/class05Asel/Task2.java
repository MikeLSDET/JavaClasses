package com.syntax.class05Asel;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		
		Scanner data=new Scanner (System.in);
		
		System.out.println("Please enter day of the week by number (1-7)");
		int day=data.nextInt();
		if (day==1|| day==2|| day==3||day==4|day==5) {
			System.out.println("It's a weekday");
		} else if (day==6||day==7) {
			System.out.println("It's a weekend");
		} else {
			System.out.println("Invalid day");
		}
		
	}	

}	

		