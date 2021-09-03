package com.syntax.class02;

public class MultipleCharacters {

	public static void main(String[] args) {
		
		
		char singleCharacter='c';
		
		String name="Dinara";
		
		String lastName="Smith";
		
		String anything="123";// as long as place in double quotes it is string
		
		String anything1="Hello my friends !!!!";
		
		String oneLetter="c";
		String oneLetterAndSpace="c ";// space is treated as a character in string
		
		String b="true";
		
		int phone=123456789;
		String phoneNumber="123-345-6789";
		
		System.out.println("Hello World");
		
		String sentence="Hello World";
		
		System.out.println(sentence);
		
		int age=22;
		System.out.println(age);
		
		//My age is 22
		
		System.out.println("My age is "+age);
		
		//My name is Dinara
		
		System.out.println("My name is "+name);
		
		String country="Spain";
		String capital="Madrid";
		
		//The capital of Spain is Madrid
		
		System.out.println("The capital of "+country+" is "+capital);
		
		String item="shirt";
		double $price=19.99;
		char sign='$';
		
		//The shirt price is 19.99
		
		System.out.println("The "+item+" price is "+$price);
		
		//add a dollar sign
		System.out.println("The "+item+" price is $"+$price);
		System.out.println("The "+item+" price is "+"$"+$price);
		System.out.println("The "+item+" price is "+sign+$price);
		
		String number2="100";
		String number3="200";
		
		System.out.println(number2+number3);//output 100200 reads + is an attachment
		
		int date=11;
		String month="July";
		int year=2021;
		System.out.println(date+month);//11July
		System.out.println(date+" "+month);//11 July
		System.out.println(date+"|"+month+"|"+year);//11|July|2021
		
		
		
		
		
	}

}
