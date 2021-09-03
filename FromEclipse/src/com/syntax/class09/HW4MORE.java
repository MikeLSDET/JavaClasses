package com.syntax.class09;

public class HW4MORE {

	public static void main(String[] args) {
		
		
		
		// HW:  From an array of integer elements find the largest number.
		
		int[] numbers= {1,10,40,200,5000};
		int largest=0;
		
		for (int i=0; i<numbers.length; i++) {
			
			if(numbers[i]>largest) {
				largest=numbers[i];
				
			}
			
		}
		
 System.out.println(largest);
	}

}
