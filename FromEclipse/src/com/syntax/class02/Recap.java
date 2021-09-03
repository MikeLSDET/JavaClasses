package com.syntax.class02;

public class Recap {

	public static void main(String[] args) {

		byte b = 1;
		short s = 10;
		int i = 100;
		long l = 1000;
		float f = 10.99f;
		double d = 100.99;
		char c = '*';
		boolean bool = false;

		System.out.println(d);

		// how do we change the value of the variable

		// int i=200; <--we cannot declare same variable twice!!

		i = 200; // can only reassign values. can only declare once!
		bool = true;

		System.out.println(bool);

		// can i do this? answer yes
		int number = i;

		System.out.println(number);

		// to change value number=500;
		number = 500;
		System.out.println(number);

		// cannot change type example : number=1.99 can't use int for decimal, but can
		// change value if same type.

		// float yeah=1.99f;
		// type name value

		/*
		 * to format your code Windows: use ctrl+shift+f
		 */
		
		

	}

}
