package com.syntax.reviewclass05;

public class NestedLoops4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 11111
		 * 22222
		 * 33333
		 * 44444
		 * 55555
		 * --------------
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 * 
		 */
		for(int j=1; j<6; j++) {
			
			for(int i=1;i<6;i++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		
		for(int l=0; l<4; l++) {
			
			for(int k=5; k>0; k--) {
				System.out.print(k);
			}
			System.out.println();
			
		}
		
		
		

	}

}
