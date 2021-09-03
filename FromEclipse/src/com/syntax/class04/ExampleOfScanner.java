package com.syntax.class04;
//shortcut for import is windows is-->ctrl+shift+o
import java.util.Scanner;//imported from Library

public class ExampleOfScanner {
	public static void main(String[]args) {
		
		String name="Serge";
		System.out.println("Hello "+name);
		//Scanner is non primitive, and is a class just like String is a class
		//System.in is taking something into the system
				//When working with Scanner use variable scan
		Scanner scan=new Scanner(System.in);// Try to memorize this** creating scanner
		
		System.out.println("Please enter your name");
		
		
		//capture String values and we stored inside variable value
		String name1=scan.nextLine();//Waits for you enter a value in console--capturing String value
		
		System.out.println(" I captured "+name1);
		// to capture different types of value with Scanner, Scanner has different ways of capturing for diff values
		
		System.out.println("Hello "+name1);
		
		//capture integer value
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		System.out.println(name1+" is "+age+" years old");
		
		
		
	}

}
