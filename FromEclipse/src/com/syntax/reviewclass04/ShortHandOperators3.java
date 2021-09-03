package com.syntax.reviewclass04;

public class ShortHandOperators3 {

	public static void main(String[] args) {
		//++a preincrement
		//a++ postincrement
		
		int x=10;
		System.out.println(++x);//x=11 increment value first then print
		System.out.println(x++);//x=11 print first, then increment. value that is is stored in x is incremented and stored in the same variable
		System.out.println(x);
		
		
		//only matters when operating values on same line, other than that ++x or x++ will print the same value

	}

}
