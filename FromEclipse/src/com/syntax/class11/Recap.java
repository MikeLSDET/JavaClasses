package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		/*
		 * Arrays are collection of values that we store in rows and columns
		 * 2D arrays is a collection of single arrays
		 * int[] array
		 * int[][] twoDArray;
		 * 
		 * twoDArray={{10,20,30}, {1,2,3}, {100,200,300}};
		 * 
		 * twoDArray.length;
		 * 
		 * data types: primitive and non primitive
		 * primitive 8;
		 * non primitive -a lot;
		 * Operators : assignment (=), relational(>,<, >=, <=, ==), arithmetic(+,-,*,/,%) logical(&&, ||, !), shorthand (+=,-=,etc,.)
		 * 
		 * conditional statements 
		 * if (if, if else, if else if)
		 * switch
		 * 
		 * loop statements; while ,do while, for , enhanced for
		 * 
		 * data structure: array (1D, 2D)
		 * 
		 */
		
		
		int[] array;
		  int[][] twoDArray= {{10,20,30} , {1,2,3}, {100,200,300,400}};
		 
		 
		  
		  int howManyArrays=twoDArray.length;
		  System.out.println(howManyArrays);// how many single dimension arrays
		  System.out.println(twoDArray[1].length);//picking an array and asking how many elements in that array
		  
		  //to get all values you need two loops
		  
		  for(int[] arr:twoDArray) {
			  for(int num:arr) {
				  System.out.print(num+" ");
			  }
			  System.out.println();
			  
		  }
System.out.println("----------------------------------------------------------------------------------");

for(int r=0; r<twoDArray.length; r++) {
	for(int c=0; c<twoDArray[r].length; c++) {
		System.out.print(twoDArray[r][c]+" ");
}
	System.out.println();
	}

}
}
