package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {

		/*
		 * i want to ask where are you from? based on the country we will define
		 * traditional food?
		 */

		Scanner in;
		String country, traditionalFood;

		in = new Scanner(System.in);

		System.out.println("Hey, where are you from?");
		country = in.nextLine();
		switch (country) {
		case "USA":
			traditionalFood = "burger";
			break;
		case "Afghanistan":
			traditionalFood = "qabeli palaw";
			break;
		case "Peru":
			traditionalFood = "cevich";
			break;
		case "Italy":
			traditionalFood = "pasta";
			break;
		case "Tajikistan":
			traditionalFood = "Kuruto";
			break;
		case "Ukraine":
			traditionalFood = "borsch";
			break;
		case "Kazakhstan":
			traditionalFood = "beshbarmak";
			break;
		case "Turkey":
			traditionalFood = "borek";
			break;
		default:
			traditionalFood = "unknown";
			break;
		}System.out.println("You are from "+country+" your traditional food is "+traditionalFood);

	}

}
