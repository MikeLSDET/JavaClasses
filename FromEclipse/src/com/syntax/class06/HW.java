package com.syntax.class06;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		//Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		
		Scanner in=new Scanner (System.in);
		
		
		
		String language;
		
		System.out.println("Please enter your country");
		String country=in.nextLine();
		
		switch(country) {
		case "USA":
			language="English";
			break;
		case "Mexico":
			language="Spanish";
			break;
		case "Portugal":
			language="Portugese";
			break;
		case "China":
			language="Chinese";
			break;
		case "Japan":
			language="Japanese";
			break;
		case "Korea":
			language="Korean";
			break;
		case "France":
			language="French";
			break;
		case "Russia":
			language="Russian";
			break;
		case "Vietnam":
			language="Vietnamese";
			break;
			default:
				language="Invalid";
		
		}System.out.println("Hello your country is "+country+" and your language is "+language);
	}

}
