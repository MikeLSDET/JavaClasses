package com.syntax.class15;

public class StringBuilderVsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * immutable - many variables can be using the same memory location(String Value) 
		 * mutable - memory location(value) is specific to a specific variable
		 * in StringBuilder a value has only one reference variable 
		 * and in Sting a value can share multiple reference variables
		 */
		
		
		/*
		 * 3 IMPORTANT POINTS TO TAKE FROM THESE CONCEPTS
		 * 
		 * 1.
		 * 2.
		 * 3.
		 */
		String str="ABCD";
		System.out.println(str.concat("Z"));
		System.out.println(str);
	//Strings are immutable/unchangeable
		StringBuilder str2=new StringBuilder("ABCD");
		
		System.out.println(str2.append("Z"));
		System.out.println(str2);
//StringBuilders are mutable/changeable
		StringBuilder str3= new StringBuilder("Sunday");
		System.out.println(str3.reverse());
		
		String name="Ali";
		StringBuilder str4=new StringBuilder(name); // converting a String to StringBuilder
		System.out.println(str4);
		
		name=str4.toString(); // Converting a StringBuilder to String
		System.out.println(name);
		
		
		//StringBuffer has a synchronization/communication feature, thread safe class, multi thread class use this
		StringBuffer string=new StringBuffer("ksjbgksjg");
		
	}

}
