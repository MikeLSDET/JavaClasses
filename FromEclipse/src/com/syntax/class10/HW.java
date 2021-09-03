package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		// Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array using 2 different loops
		
		String[][] cars= {
				{"Chevy", "Ford","Dodge"},
				{"Mercedes Benz","VW","Audi"},
				{"Hyundai","Kia","Proto"},
				{"Fiat","Ferrari","Lamborghini"}
				
		};
		
		for (int i=0; i<cars.length; i++) {
			
			for(int j=0; j<cars[i].length; j++) {
				
				System.out.println(cars[i][j]);
				
			}
		}
		
		
		for(String[] car:cars) {
			
			for(String c:car) {
				System.out.println(c+" ");
			}
			
		}

	}

}
