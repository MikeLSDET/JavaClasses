package com.syntax.class07;

public class Task2For {

	public static void main(String[] args) {
		
		/*
		 * Print numbers from 1 to 100 in 1 line with space


Print numbers from 100 to 1


Print even numbers from 20 to 1 (2 ways)


Print odd numbers between 20 and 50 (2 ways)

		 */
		
		//task1
		
		for (int i=1; i<=100; i++) {
			
			System.out.print(i+" ");
		}
		
		//task2
		
		for (int f=101; f>=1; f--) {
			System.out.println(f);
		}
		
		//task3 option 1
		
		for(int t=21; t>=1; t--) {
			if(t % 2==0) {
				System.out.println(t);
			}
			
			//task3 option 2
			
			for(int h=20; h>=1; h-=2) {
				System.out.println(h);
			}
			//Print odd numbers between 20 and 50 (2 ways)
			//task4 option 1
			
		
		}

	}

}
