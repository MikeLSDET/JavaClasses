package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		// Create an array of animals and store 6 elements into it. Using 2 different loops print all elements from the array.
		
		//Way1
		String[] animals= {"Cow", "Dog", "Cat", "Monkey","Chicken", "Horse"};
		
		for (int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
		}
		
		
		//Way2
		
		for (String animal:animals) {
			System.out.print(animal+" ");
		}

	}

}
