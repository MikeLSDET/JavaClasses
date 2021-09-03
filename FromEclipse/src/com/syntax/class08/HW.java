package com.syntax.class08;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Task Using nested loops, create a car odometer that will print mileage from 00000 till 99999
		
		
		
		for (int h = 0; h <= 9; h++) {

			for (int j = 0; j <= 9; j++) {

				for (int n = 0; n <= 9; n++) {

					for (int y = 0; y <= 9; y++) {
						for (int z = 0; z <= 9; z++) {
							System.out.println(h + " " + j + " " + n + " " + y + " " + z);
						}
					}

				}

			}
		}

	}

}
