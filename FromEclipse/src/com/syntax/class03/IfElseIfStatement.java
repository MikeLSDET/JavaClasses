package com.syntax.class03;

public class IfElseIfStatement {
	public static void main(String[] args) {
		/*
		 * 
		 * what is the largest number
		 */
		
		/*
		 * if for primary condition
		 * else if for other/multiple conditions
		 * else for false statment
		 */
		
		int num1=20;
		int num2=20;
		
		if (num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		} else if (num1<num2) {
			System.out.println(num2+num1+" is smaller than "+num2);// else if is a ladder, check 1st condition and if false checks the next etc.,
			//system wants to find its true condition and once found,ignores/does not read the rest
		}else {
			System.out.println(num1+" is equal to "+num2);
		}
		
		System.out.println("--------------------");
		
		/* 
		 * Declare a variable day and then based on the day value provide an output such as
		 * if day is equal to 1 -->Today is Monday
		 * if day is equal to 2-->Today is Tuesday
		 */
		
		int day=70;
		
		if (day==1) {
			System.out.println("Today is Monday");
		} else if (day==2) {
			System.out.println("Today is Tuesday");
		} else if (day==3) {
			System.out.println("Today is Wednesday");
			
		}else if (day==4) {
			System.out.println("Today is Thursday");
		} else if (day==5) {
			System.out.println("Today is Friday");
		}else if (day==6) {
			System.out.println("Today is Saturday");
		}else if (day==7){
			System.out.println("Today is Sunday");
		}else {
			System.out.println(day+" is invalid. Please use day from 1-7 ");
		}
			
			
			
		
		
	}

}
