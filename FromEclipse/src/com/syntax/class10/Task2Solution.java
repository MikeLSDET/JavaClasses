package com.syntax.class10;

public class Task2Solution {

	public static void main(String[] args) {
		
		String[] countries= {"Afghan", "Tajiki", "USA", };
		String capital=null;
		
		for (int i=0; i<countries.length; i++) {
			System.out.println(countries[i]);
		}
		
		for(String country:countries) {
			if(country.equals("Afghan")) {
				capital="Kabul";
			}else if(country.equals("Tajiki")) {
				country= "Dushanbe";
			}else if (country.equals("USA")) {
				capital="Washington D.C";
			}
			
			System.out.println("The country of "+ country + " is "+capital);
		}
		
		
		String cap=" ";
		
		for (int i=0; i<countries.length; i++) {
			
			switch (countries[i]) {
			case "Afghan":
				cap="Kabul";
				break;
			case "Tajiki":
				cap="Dushanbe";
				break;
			case "USA":
				cap="Washington D.C";
				break;
			}
			
			System.out.println("The country of "+ countries[i] + " is "+cap);
		}

	}

}
