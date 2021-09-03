package com.syntax.class03;

public class IfStatementDemo {

	public static void main(String[] args) {
		
		
		int num1=12;
		
		int num2=20;
		
		if (num1>num2) {//no execution because at "checkpoint" we gave a red light to the if statement since it is not true
			System.out.println("num1 "+num1+" is larger than num2"+num2);
			
		}
		
		
		double money=10;//implicit casting is happening
		double $priceCookies=5.99;
		
		if (money>$priceCookies) {//statement executed because the statement is true, at the "checkpoint" we gave the green light
			System.out.println("I am buying those cookies");
		}
		
		//"if" blocks({}) execute only when condition is true.
		
	// no semi colons before blocks of code
		
		
		
		
		

	}

}
