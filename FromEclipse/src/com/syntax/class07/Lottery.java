package com.syntax.class07;

import java.util.Scanner;

public class Lottery {
/*
 * 
 * we have a secret number (any number from 1 until 20)
 * ask user to guess your secret number
 * continue guessing the number UNTIL user enters your secret number
 * once guessed correctly, let's say congratulations you got it!
 */
	public static void main(String[] args) {
		// REMEMBER "WHILE" ONLY EXECUTES WHEN CONDITION IS TRUE!!!!
		Scanner in;
		int secretNumber, userNumber;
		secretNumber=15;
		
		in=new Scanner(System.in);
		
		do {
		System.out.println("Please guess my secret number from range 1 to 20");
		userNumber=in.nextInt();
		
		}while(userNumber != secretNumber);
		
		System.out.println("congratulations you got it!");
		
		
		
		
		

	}

}
