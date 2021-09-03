package com.syntax.class03;

public class WhatHappens {

	public static void main(String[] args) {
		//2 types of casting implicit= storing something small into something bigger
		// explicit= storing something bigger in something smaller, (will lose value)
		
		//int i=1.99; error due you saying you are going to put int value but you put value as a decimal
		/*
		 * 
		 */
		
		
		double d=1;
		System.out.println(d);//outcome is 1.0, double is taking the int value and casting into double because double is the
		/*
		 * biggest type of value out of the numeric values so it automatically converted the int into a double value
		 * 
		 * = implicit casting/widening
		 */
		
		
		int i=(int)1.99;//converted double(larger value) to int(smaller value), 
		/*
		 * because of this you're narrowing the value
		 * with this is type of casting, sometimes values lose some value
		 * that's why 1.99 output turned into 1
		 * =narrowing casting/explicit
		 */
		System.out.println(i);
		
		//another example below
		
		byte b=(byte)128;
		System.out.println(b);
		/*
		 * value was lost, explicit casting
		 */
		
		//another example
		
		int num=(int)9.99;
		System.out.println(num);// loss some value= explicit casting
		
		//example of explcit/narrowing and implicit/ widening below
		
		int num2=20;
		int num1=3;
		
		System.out.println(num2/num1);//narrowing equals 6
		
		double num3=20;
		double num4=3;// here conversion happens from int to double happens
		//dividing two double values
		System.out.println(num3/num4);//widening equals 6.66666667
		
		//any decimal is automatically represented as double value, unless stated otherwise by putting an f(float)
		
		
		
		
		int n1=20;
		int n2=3;
		double dd=n1 / n2;//we divide  2 int values and only then results are storing in the double types
		System.out.println(dd);//6.0
		
		
	
		
		
		
		
		
		
	}

}
