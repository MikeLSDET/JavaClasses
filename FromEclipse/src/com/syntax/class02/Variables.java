package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name="Michael";
		String lastname="Lopez";
	    char grade='F';
		String city="Arlington";
		String state="VA";
		String phone="703-777-777";
		
		System.out.println("My name is "+name+" and my last name is "+lastname);
		System.out.println("I am an "+grade+" student");
		System.out.println("I live in "+city+" and "+state);
		System.out.println("And my phone number is "+phone);
		
		city="Lalapalooza";
		state="Disneyland";
		phone="666-666-6666";
		grade='A';
		
		System.out.println("My name is "+name+" and I move to the new city, "+city+" and the new state "+state+"."+" My new phone number is "+phone);
		
		String student="My name is "+name+" and I move to the new city, "+city+" and the new state "+state+"."+" My new phone number is "+phone;
		
		System.out.println(student);
				
				

	}

}
