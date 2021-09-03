package com.syntax.class09;

public class AdvancedForLoop {

	public static void main(String[] args) {

		System.out.println("-------- NUMBERS ARRAY--------------");

		int[] numbers = { 100, 20, 67, 45, 90, 23 };

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		
		System.out.println("----------------advance for loop-----");
		
		
		for(int num:numbers) {
			System.out.println(num);
		}
	}
}
