package com.syntax.reviewclass03;

public class FloatNumbers {

	public static void main(String[] args) {
		
		
		
		/*
		 * if you have to store whole numbers always prefer int
		 * if you have to store decimal numbers always prefer double
		 */
		
		float number=5.3f;//will be converted to 1 and 0's
		if(number==5.3) {
			System.out.print("success");
		}else {
			System.out.println("Failure");
		}
		
		float f=5.3333333333333333333333333f;
		double d=5.3333333333333333333333333333333;
		System.out.println(f);
		System.out.println(d);
	}

}
