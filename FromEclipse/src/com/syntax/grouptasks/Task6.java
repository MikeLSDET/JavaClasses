package com.syntax.grouptasks;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6. Write a Java program to print the first 10 numbers of fibonacci series.
		//0, 1,1,2,3,5,8,13 21 34...
		
		int previousNumber=0;
		int currentNumber=1;
		int sumOfPreviousAndCurrent=0;
		int numbersToGenerate=10;
		System.out.println(previousNumber);
		System.out.println(currentNumber);
		for (int i=0; i<numbersToGenerate-2; i++) {
			sumOfPreviousAndCurrent=previousNumber+currentNumber;
			System.out.println(sumOfPreviousAndCurrent);
			previousNumber = currentNumber;
			currentNumber=sumOfPreviousAndCurrent;
		}
		

	}

}
