package com.syntax.reviewclass06;

public class StringPart1 {

	public static void main(String[] args) {
		String str = "Hello";
		
		String str2 = new String("Hello");
		
		//to identify the length of the string
		System.out.println(str.length());
 
		System.out.println(str2.length());
		
		//to convert the string into uppercase
		String name= "My name is aka naughty boy";
		System.out.println(name.toUpperCase());
		
		//to convert the string into lowercase
		String name2= "MY NAME IS BILAL";
		System.out.println(name2.toLowerCase());
		
		//add 2 strings together
		String firstName= "Michael";
		String secondName = "Bilal";
		
		System.out.println(firstName.concat(" ").concat(secondName));
		
		System.out.println(firstName+ " "+secondName);
		
		//isEmpty
		String batch =" Batch10";
		boolean results=batch.isEmpty();
		System.out.println(results);
		
		//to remove the whitespace from the string
		String newString ="           Batch10       ";
		
		
		System.out.println(newString);
		System.out.println(newString.trim());
		
		String newS="Batch 10";
		System.out.println(newS.replace(" ", ""));
		
		//to check starting point of String
		String longString = "This is SDET batch";
		System.out.println(longString.startsWith("T"));
		System.out.println(longString.startsWith("S"));
	}

}
