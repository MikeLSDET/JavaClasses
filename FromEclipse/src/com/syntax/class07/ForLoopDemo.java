package com.syntax.class07;

public class ForLoopDemo {
	public static void main(String[] args) {

		/*
		 * for loop is best used when we know how many times we want to execute code I
		 * want to say hello 5 times
		 * 
		 * 
		 */
		
		/*
		 * for (initialization; condition; increment/decrement){
		 * 
		 * code to be repeated
		 * 
		 * }
		 * 
		 * 
		 */
		
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
		}
		
		System.out.println("  WANT TO PRINT NUMBERS FROM 1 to 10");
		/*
		 * simple way to look at it
		 * for (start; end; increment/decrement){
		 * code to be repeated
		 * }
		 * 
		 */
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("   WANT TO PRINT NUMBER FROM 20 TO 10");
		for(int i=20; i>=10; i--) {
			System.out.print(i+ " ");
		}
		
		
		System.out.println(" WANT TO PRINT EVEN NUMBERS FROM 10 TO 100");
		
		for(int i=10; i<=100; i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println(" WANT TO PRINT EVEN NUMBERS FROM 10 TO 100 W/ HELP OF IF STATEMENT");
		for (int i=10; i<=100; i++) {
			if (i % 2 ==0) {
			System.out.print(i+" ");
		}
			
			for (int c=1; c<=50; c+=10) {
				
				System.out.println(c);
			}
		
	}
}
}