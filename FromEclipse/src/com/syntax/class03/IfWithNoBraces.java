package com.syntax.class03;

public class IfWithNoBraces {
	public static void main (String[]args ) {
		
		double temp=31;
		
		if (temp < 32) 
			System.out.println(" Water will freeze with temperature "+temp);
			
		 
			else System.out.println(" Water will NOT freeze "+temp);// cacn only take one line if no curly brackets
			System.out.println(" Because it is warm outside");// runs this one by itself since not apart of else statement
		//when "if"/"else" statement is used without{} then java allows only 1 statement for each block
	}

}
