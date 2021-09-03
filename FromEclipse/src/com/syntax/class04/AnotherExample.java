package com.syntax.class04;

import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);//importing scanner formula
		
		
		System.out.println("Please enter city");
		String city=input.nextLine();//capturing String value and we need to hit enter
		
		
		System.out.println("Please enter temperature in your city");
		double temp=input.nextDouble();//capturing Double value and we need to hit enter
		System.out.println(temp);
		
		System.out.println("It is "+temp+" in "+city);
	}

}
