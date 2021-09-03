package com.syntax.class02;

public class AddingOrConcatenating {

	public static void main(String[] args) {
		
		
		String a="Hello";
		String b="World";
		
		int c=10;
		int d=20;
		
		System.out.println(c+d+a+b);//read from left to right 10+(addition)20=30 then a+(concatenate)b=HelloWorld answer is 30HelloWorld
		System.out.println(a+c+b+d);// Hello+10+World+20
		System.out.println(a+(c+d)+b);//Hello30World left to right but parenthesis first due to PEMDAS rule
		System.out.println(a+c+d+b);//Hello1020World
		System.out.println(a+b+c+d);//HelloWorld1020
		
		String combined=a+b+c+d;
		System.out.println(combined);
		
		char grade='A';
		
		String str="Student";
		
		String newString=grade+" "+str;
		
		System.out.println(newString);
		
		
		
		
	}

}
