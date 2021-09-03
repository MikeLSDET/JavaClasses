package com.syntax.class04;

import java.util.Scanner;

public class Homework3 {
	public static void main (String[]args) {
		
		/*
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		 */
		
		Scanner data=new Scanner (System.in);
		
		System.out.println("Please enter your city");
		String city=data.nextLine();
		System.out.println("What is your city's temperature?");
		Double temp=data.nextDouble();
		double cel=(temp-32*.5556);
		System.out.println("The temperature in the city "+city+" is "+cel);
		
		
		
	}

}
