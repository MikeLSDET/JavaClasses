package com.syntax.class10;

public class Task1Array {

	public static void main(String[] args) {
		
		//Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print the following:
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		String[][] array= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"},
				
				
		};
		System.out.println(array[0][1]+". "+array[1][0]);
		System.out.println(array[0][0]+". "+array[1][3]);
		System.out.println(array[0][2]+". "+array[1][2]);
		System.out.println(array[0][3]+". "+array[1][1]);
		
		
		
		System.out.println("-------------------------------------------");
		//how to access all elements
		
		for (int r=0; r<array.length; r++) {//outer loop iterates over rows
			
			for (int c=0; c <array[r].length;c++) { //inner loop iterates over columns
				System.out.print(array[r][c]+" ");
			}
			
			System.out.println(" ");
			
		}
		
		System.out.println("-----------------------------");
		
		for(String[] arr:array) {
			
			for(String a:arr) {
				System.out.print(a+" ");
			}
			
			System.out.println();
		}
		
		
		

	}

}
