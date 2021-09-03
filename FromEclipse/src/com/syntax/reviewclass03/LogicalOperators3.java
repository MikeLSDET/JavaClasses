package com.syntax.reviewclass03;

import java.util.Scanner;

public class LogicalOperators3 {

	public static void main (String []args) {
		
		//when one condition depends on another condition, use nested if 
		
		String userName="Maria";
		String password="pass123";
		int availableFunds=100000;
		
		if(userName.equals("Maria") && password.equals("pass123")) {
			System.out.println("Enter the amount of money that you want to transfer");
			Scanner scanner=new Scanner(System.in);
			double amountToTransfer=scanner.nextDouble();
			if(amountToTransfer<availableFunds) {
				System.out.println("Transfer successful");
				
				
			}else {
				System.out.println("Insufficient balance");
			}
		}else {
			System.out.println("Invalid credentials");
		}
		
		
		
		
	}
	
}
