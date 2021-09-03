package com.syntax.class09;

public class HW2 {

	public static void main(String[] args) {
		// Create an array to store double values and then print those in reverse order
		
		double[] num= {1.00, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8};
		
		for (int i=num.length-1; i>=0;i--) {
			
			System.out.print(num[i]+" ");
		}

	}

}
