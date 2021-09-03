package com.syntax.class13;

public class HelloCountry {
	
	//Create a method that will say Hello in different language based on the country that will passed when method is executed.

	String countryHello(String country ) {
		if(country=="USA") {
			return "Hello";
		}else if (country=="Mexico") {
			return "Hola";
		} else if (country =="France") {
			return "Bon Jour";
		} else {
			return "Invalid country";
		}
		
}
}
