package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 3. Write a program that reads a range of integers 
		 * (start and end point),
		 * provided by a user
		 * and then from that range prints the sum of the even and odd integers.
		 */
		Scanner scan;
		
		int start, end, evenSum=0, oddSum=0;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter starting integer");
		start=scan.nextInt();
		System.out.println("Please enter ending integer");
		end=scan.nextInt();
		
		for(int i=start; i<=end; i++) {
			
			if(i %2==0) {
				evenSum+=i;
			}else {
				oddSum+=i;
			}
		}
		
		System.out.println("Sum of even number from range "+start+" until "+end+" equals to "+evenSum);
		System.out.println("Sum of even number from range "+start+" until "+end+" equals to "+oddSum);
		

	}

}
