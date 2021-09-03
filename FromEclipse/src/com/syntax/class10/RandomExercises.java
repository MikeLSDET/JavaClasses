package com.syntax.class10;

import java.util.Scanner;

public class RandomExercises {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter the number of indexs you would like");
		int size=scan.nextInt();
		
		int[] numbers=new int[size];
		int sum=0;
		
		for(int i=0; i<size; i++) { 
			System.out.println("values of i is "+i);//0 then 1 then 2 then 3 then 4
			sum=sum+i;
			System.out.println("values of sum is "+sum);//0 then 1 then 3 then 6 then 10
			
		}
				
		
		
		

	}

}
