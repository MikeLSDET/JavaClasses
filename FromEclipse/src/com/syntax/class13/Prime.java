package com.syntax.class13;

public class Prime {
	
	//Write a method to return whether given number is prime or not?
	
	void prime(int num1) {
		if(num1%2==0  &&num1!=2) {
			System.out.println("Not Prime");
			
		} else if(num1==0||num1==1) {
			System.out.println("neither prime or composite");
		}else if (num1%num1==0) {
			System.out.println("prime number");
		}
	}

}
