package com.syntax.class07;

public class WhyNeedLoops {

	public static void main(String[] args) {
		
		//I want to say hi 4 times
		
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		int a=1;
		System.out.println("------------Hello using if statement--------");
		if(a<4) {
			System.out.println("Hello");
		}
		
		
		System.out.println("------Hello using while loop-------");
		//while runs infinitely if you don't put a stop, loop makes a literal loop of condition until you put "stop sign"
		
		/*
		 * EXAMPLE OF INFINITE LOOP
		 * while(a<4) {
			System.out.println("Hello");
			}
		 */
		
		
		
		
		//you could add<= to print out 4 times 
		while(a<4) {
			System.out.println("Hello");
			a++;//+1=2, then loops again to =1=3, then+1=4, then stops since 4 is not less then 4
		}
		
		
		
		
	}

}
