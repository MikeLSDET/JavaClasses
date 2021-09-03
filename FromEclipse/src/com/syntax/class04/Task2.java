package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		double rateMortgage=4;
		double priceMortgage=300000;
		
		if(rateMortgage<4.5) {
			System.out.println("User will buy house");
			if (priceMortgage>200000){ 
				System.out.println("user will take loan");
				
			}else {
				System.out.println("user will use cash");
			}
			
		}else {
			System.out.println("User will not buy house");
		}
				

	}

}
