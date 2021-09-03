package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		
		
		for (int i=1; i<=6; i++) {
			System.out.println("Today is Sunday");
			
			if(i==4) {
			System.out.println("I am stopping the loop");
			break;// when JAVA sees break it knows it breaks from the block of code
		}
			System.out.println(i);
		}
			boolean summer=true;
			int temp=80;
			
			while(summer) {
				if(temp>95) {
					System.out.println(" I do not love hot summer");
					break;
				}
				
				
				
				System.out.println(" I love summer");
				
				
				temp+=2;
			}
			
			
			//break is a keyword that can be used inside any loop -->
			// it exist in loop body (loop block of code). if there is any other code below the break --> that code will be skipped
	}

}
