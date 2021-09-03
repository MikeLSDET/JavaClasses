package com.syntax.class14;

public class Task4 {
//Write a method to return whether given number is prime or not?
	
	boolean isPrime(int number) {
		
		if(number>1) {
			
			for (int i=2; i<number; i++) {
				if (number%i==0) {
					return false;
				}
			}
		}else {
			return false;
		}
		
		return true;
	}
	
	/*
	 * Create class student that will have a method
	 * getGrade. Your method should accept the score of a 
	 * student and return a grade:
	 * 
	 */
	/*
	 * score ?90 a
	 * score >80 B
	 * score >70
	 * score >50 D
	 * anything else -F
	 */
	
	char getGrade (double numbers) {
		if (numbers>90) {
			return 'A';
		}else if (numbers>80) {
			return 'B';
		}else if(numbers>70) {
			return 'C';
		} else if (numbers>50) {
			return 'D';
		} else {
			return'F';
		}
	}
	
	
	
}
