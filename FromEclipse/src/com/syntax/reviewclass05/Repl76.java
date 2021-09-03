package com.syntax.reviewclass05;

import java.util.Scanner;

public class Repl76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array=new String[7];
		Scanner scanner=new Scanner(System.in);
		for(int i=0; i<7; i++) {
			System.out.println("Please Enter day "+(i+1)+" of the week");
			array[i]=scanner.nextLine();
		}
		
		for(int i=0; i<7; i++) {
			
			
					System.out.println(array[i]);
		}
		
		

	}

}
