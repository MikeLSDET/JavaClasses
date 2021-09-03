package com.syntax.class09;

public class Task5 {

	public static void main(String[] args) {
	
		
		
		System.out.println("-------CARS ARRAY----------");
		
		String [] cars={"Toyota", "Chevy", "Honda","Mercedes","Porsche","Tesla"};
		int size=cars.length;
		
		for(int i =0; i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
		
		System.out.println("advance for loop AKA enhanced for loop AKA for each loop------");
		
		//used only and only when working with arrays
		//advance loops only work with arrays or collections
		
		for(String car:cars) {
			
			System.out.println(car);
		}
		
		
		

	

}
}
