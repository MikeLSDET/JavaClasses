package com.syntax.class10;

public class Task2Array {

	public static void main(String[] args) {
		//Create a 2D array that first row will contain 4 names and second row will contain grades. 
		//Then your program should print name of the students that has A and B grade
		
		
		
		String[][] array= {
				{"John", "Lucifer", "Adam", "Penelope"},
				{"A","B","C","D"}
		};
		System.out.println(array[0][0]+" grade is "+array[1][0]);
		System.out.println(array[0][1]+" grade is "+array[1][1]);

	}

}
