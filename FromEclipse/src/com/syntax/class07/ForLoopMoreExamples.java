package com.syntax.class07;

public class ForLoopMoreExamples {

	public static void main(String[] args) {
		
		/*
		 * I want to print multiplication table
		 * 
		 * 1X1=1;
		 * 1X2=2;
		 * ....
		 * 1X10=10
		 */

		
		int num=1;
		
		for(int i=1; i<=10;i++) {
			
			System.out.println(num+"X"+i+"="+num*i);
			
		}
		
		System.out.println("What is the output");
		
		int sum=0;
		
		for (int i=1; i<=5; i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
		
		System.out.println("What is the output");
		
		sum=0;
		
		for(int i=0; i<=40; i+=10) {
			sum+=i;
			
		}
			System.out.println(sum);	
			
			
			
			
			System.out.println("What is the output?");
			
			int total=1;
			
			for(int i=1; i<10; i++) {
				total*=i;
			}
			
			System.out.println(total);
			
			
			
			/*
			 * HW Task
			 * 
			 * Please find sum of even and sum of odd number from 1 to 100
			 */
			
			/*
			 * ASk user to pay for candy
			 * keep asking user to pay for candy until entered price is not equal to 3
			 * if entered value is more than 3 --> please give less money
			 * otherwise --> please give more money
			 * after user got a right amount print "Please enjoy your candy"
			 */
	}

}
