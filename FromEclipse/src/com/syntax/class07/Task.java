package com.syntax.class07;

public class Task {

	public static void main(String[] args) {
		
		
		
		/*
		 * Print numbers from 1 to 100 in 1 line with space


Print numbers from 100 to 1


Print even numbers from 20 to 100 


Print only odd numbers from 100 to 1
		 */
		
		
		//Task1
		int a=1;
		
		while(a<=100) {
			System.out.print(a+" ");
			a++;
		}
		
		//Task2
		int b=100;
		
		while(b>=1) {
			System.out.println(b);
			b--;
			
		}
		
		//task3
		
		int c=20;
		while(c<=100) {
			if(c % 2 ==0) {
				System.out.println(c);
			}
			c++;
		}
		
		
		
		//task4
		
		int d=100;
		
		while(d>=1) {
			if(d % 1 ==0) {
				System.out.println(d);
			}
			d--;
		}
		
		
		
		
		

	}

}
