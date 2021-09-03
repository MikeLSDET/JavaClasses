package com.syntax.class09;

public class AdvanceForLoop2 {

	public static void main(String[] args) {
		System.out.println("------ CHAR ARRAY ---------------");
		
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F', };
		// char is the data type, grade is the new char variable and the collection (:grades) is where you are grabbing the values for new char variable grade
		for(char grade:grades) {
			System.out.print(grade+" ");
		}
		
		System.out.println(" I want to print values backwards!!!");
		
		
		for (int i=grades.length-1; i>=0; i--) {
			
			System.out.print(grades[i]+" ");
		}

	}

}
