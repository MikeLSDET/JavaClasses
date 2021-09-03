package com.syntax.reviewclass05;

public class NestedLoops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 * 
		 */
		
		//try writing your inner loop first then outer loop, reduces errors makes it more simple
		
		for(int j=0; j<4; j++) {
			for(int i=1; i<10; i++) {
				if(i==5 && j==1) {
					continue;
				}
				System.out.print(i);
			}
			System.out.println();
		}
		

	}

}
