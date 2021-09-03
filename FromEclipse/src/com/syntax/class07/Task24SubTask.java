package com.syntax.class07;

public class Task24SubTask {

	public static void main(String[] args) {
		
		//Print odd numbers between 20 and 50 (2 ways)
		//task4 option 1
		
		for(int i=20; i<=50;i++) {
			if(i % 2 !=0){
				System.out.println(i);
			}
		}
		
		//task 4 option 1
		for(int d=21; d<=50; d+=2) {
			System.out.println(d);
		}

	}

}
