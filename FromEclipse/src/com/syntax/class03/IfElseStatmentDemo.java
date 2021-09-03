package com.syntax.class03;

public class IfElseStatmentDemo {
	//shortcut for main method is to type main +ctrl+space+enter
	public static void main (String[] args) {
	
		/*
		 * I have money and I know the price
		 * if i have more money--> I will buy cookies
		 * otherwise i will cry
		 */
		
		System.out.println("Beginning of my program");
		
		double money=10;
		double $cookie=5.99;
		
		if(money>$cookie) {//if true
			
			System.out.println("I am buying those cookies");
		} else {//if false
			System.out.println("I am going to cry");
		}//output is I am buying those cookies since if statement is true
		
		
	}

}
