package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		int age = 18;
		int weight = 107;

		if (age >= 18) {
			System.out.println("Person is 18 years old or older");
			if (weight >= 110) {
				System.out.println("Person is recommended weight");
			} else {
				System.out.println("Person is underweight, therefor not eligible for blood donation.");
			}
		} else {
			System.out.println("Too young to donate blood");
		}

	}

}
