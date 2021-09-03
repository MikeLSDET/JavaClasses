package com.syntax.class03;

public class MoreIfExamples {
	
	public static void main (String[] args) {
		
		double a=30;
		double b=20;
		
		if (a<b) {
			System.out.println(" a is larger than b ");
		}else {
			System.out.println(" im not dont print it");
		}
		
		
		if (a==b) {// condition always must be a boolean value
			System.out.println("Numbers are equal");
			
		} else {
			System.out.println("Numbers are not equal");
			System.out.println("Numbers are not twins");
		    System.out.println("I am else block code");
		}
		
		System.out.println("---------------------------");
		
		
		
		
		System.out.println(a=b);
		
		System.out.println("--------");
		// if it is break time--> i will get a coffee otherwise i will focus on class
		boolean isBreakTime=true;//since value is true "if" statement will will be output " i am getting coffe"
		
		if (isBreakTime) {
			System.out.println(" I am getting my coffee");
		}else{
			System.out.println(" I am focusing on the class");
		}
		/*
		 * if you are hungry --> I will go eat
		 * otherwise --> I will go have a tea
		 */
				
			boolean isHungry=true;//isHungry holds true value so "if" statement will be the output
			
			if(isHungry) {
				System.out.println("I will go eat");
			} else {
				System.out.println(" I will go have a tea");
			}
			
		
	}

}
