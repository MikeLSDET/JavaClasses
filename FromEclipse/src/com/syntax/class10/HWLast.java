package com.syntax.class10;

public class HWLast {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array.
		
		
		int[] num= {10, 20, 100, 50, 222};
		int largest = num [0];
		
		for (int i=1; i<num.length; i++) {
			
			if(num[i]>largest){
				largest=num[i];
			}
		}
		
		System.out.println(largest);
		
		System.out.println("--------------------------enhanced loop solution below");
		
		largest = num [0];
		
		for(int n:num) {
			
			if(n>largest) {
				largest=n;
			}
		}
		System.out.println(largest);

	}

}
