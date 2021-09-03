package com.syntax.reviewclass05;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=10;
		String name="Michael";
		String name1="Sharif";
		
		/*
		 * limitation of arrays we can store only one value at a time in a variable
		 * if we try to store more values, previous values are overwritten
		 * to overcome these issues we use Arrays
		 */
		
		String [] names= new String[120];
		names[0]="Eugene";
		names[2]="Andrie";
		System.out.println(names[0]);

	}

}
