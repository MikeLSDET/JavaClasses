package com.syntax.class14;

public class StringDemo {

	public static void main(String[] args) {
		
		String str="Hello  +)&^";
		
		String str2=new String ("Hello");
		
		System.out.println(str2.length());
		System.out.println(str.length());
		
		//
		String name="MICHAEL";
		System.out.println(name.toLowerCase());
		
		String name23="noor khan 123";
		System.out.println(name23.toUpperCase());
		
		
		//
		String firstName="Andrei";
		String lastName=" Drozzhin";
				System.out.println(firstName.concat(" ").concat(lastName));
				System.out.println(firstName.concat(" ").concat(lastName));
				System.out.println(firstName+" "+lastName);
	}

}
