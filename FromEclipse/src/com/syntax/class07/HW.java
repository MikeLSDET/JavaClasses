package com.syntax.class07;

public class HW {

	public static void main(String[] args) {
		/*
		 * HW Task
		 * 
		 * Please find sum of even and sum of odd number from 1 to 100
		 */
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int i= 1; i<= 100; i++) {
			if (i % 2 ==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		System.out.println("Sum of all even numbers is "+sumEven);
		System.out.println("Sum of all odd numbers is "+sumOdd);
		
		
		
		
		
	}

}
