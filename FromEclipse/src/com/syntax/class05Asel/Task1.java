package com.syntax.class05Asel;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		Scanner data=new Scanner (System.in);
		
		System.out.println("Please enter your height in inches.");
		
		int num=data.nextInt();
		
		
		
		
		if (num<60) {
			System.out.println("short");
		} else if (num>=60 && num<72) {
			System.out.println("Medium");
		} else if (num>=72) {
			System.out.println("Large");
		}
		

	}

}
