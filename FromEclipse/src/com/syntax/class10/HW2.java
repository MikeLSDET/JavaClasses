package com.syntax.class10;

public class HW2 {

	public static void main(String[] args) {
		//Using 2D array create a grocery list.
		//Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops
		
		System.out.println("-------------------WAY 1 below-------------------------");
		
		String [][] groceries= {
				{"carrot","lettuce","spinach","beets"},
				{"apple","mango","orange","banana"},
				{"milk","cheese","yogurt","heavy cream"},
				{"cake","muffin","cupcake","cookies"}
		};
		
		
		for(int i=0; i<groceries.length; i++) {
			
			for(int j=0; j<groceries[i].length; j++) {
				
				System.out.println(groceries[i][j]);
			}
		}
		
		System.out.println("------------------------WAY 2 Below-----------------------------");
		for(String[] grocery:groceries) {
			for(String g:grocery) {
				System.out.println(g);
			}
			
		}

	}

}
