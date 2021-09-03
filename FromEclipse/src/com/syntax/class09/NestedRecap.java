package com.syntax.class09;

public class NestedRecap {

	public static void main(String[] args) {
		

		  for(int i=1; i<=5; i++){
		  	
		 System.out.println ("Loop i");
		  		
		  		for(int j=1; j>4; j++) {
		  			System.out.println("Loop j");
		  
		    }
		  }
		  
		  
		  System.out.println("--------------------Multiplication Table----------");
		  
		  for (int a=1; a<=5; a++) {
			  
			  for(int b=1; b<=10; b++) {
				  
				  System.out.println(a+"X"+b+" = "+(a*b));
			  }
		  }
		  
		  System.out.println("-------------");
		  
			for (int i = 0; i <= 23; i++) {

				for (int j = 0; j <= 59; j++) {
					if (i > 10) {
						System.out.println(+i + ":" + j);
					} else if (i < 10 && j<10) {
						System.out.println("0" + i + ":" + j+"0");
					
					}
				}

			}

		}
}