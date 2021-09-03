package com.syntax.class05Asel;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		
		//3. Write a program to find largest number among three numbers using nested if provided by a user (numbers must be distinct)

		Scanner scan=new Scanner(System.in);
		
	
		System.out.println("Please enter distinct 3 numbers ");
		int num1, num2, num3, largest= 0;
	
		
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		
		if(num1>num2 && num1>num3) {
		 largest=num1;
		} else if (num2>num1 && num2>num3) {
			largest=num2;
		}else if (num3>num2 && num3>num1) {
			largest=num3;
		}
		
		System.out.println("The Largest number is "+largest);
	} 
}
