package com.syntax.class05Asel;

public class LoigcalAnd {

	public static void main(String[] args) {
		
		
		boolean understandJava=true;
		boolean enjoy=true;
				
				
		if(understandJava&&enjoy) {
			System.out.println("that is awesome");
		}else {
			System.out.println("Please try to spend more time with Java");
		}

		/*
		 * declare a number
		 * if number is larger than one AND smaller than 10-->SMALL
		 * if number is larger than 10 but smaller than 100-->MEDIUM
		 * if number is larger than 100 but smaller than 1000-->Large
		 * 
		 * 
		 */
		
		
		/*
		 * AND OPERATOR
		 * true && true -> True
		 * true && false -> False
		 * false && true ->False
		 * false && false ->False
		 */
		int num=0;
				
		if(num>0) {
			
		
		
		if(num>=1&&num<10) {
			System.out.println("Number is small");
		}else if (num>=10&&num<100) {
			System.out.println("Number is medium");
		}else if (num>=100&&num<1000) {
			System.out.println("Number is large");
		}else {
			System.out.println("Number is huge");
		}
		}else {
			System.out.println( "Number is neither positive or negative");
		}
		
		
		/*
		 * OR operator
		 * true || false -> True
		 * true || true -> true
		 * false || true -> true
		 * false || false -> false
		 */
		 
		
	}

}
