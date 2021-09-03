package com.syntax.class15;

public class StringVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is good for repetitive values since seach will be performaed and will create a method cell but not a heap cell if value already exist and string Builder is good for unique values
		//inside Strings instead of creating new variables, we create one or two memory locations, if some data is being repeated.//inside Strings instead of creating new variables, we create one or two memory locations, if some data is being repeated.
		//String builders are faster because they do not peform search
		//When main focus is speed use StringBuilder, if main focus is memory use String
		String name="jack";
		String address="asdjasfjkhfj";
		String city="Newyork";
		
		
		String name2="jack";
		
		String address2="asdjasfjkhfj";
		String city2="Newyork";

		
		StringBuilder name3=new StringBuilder("Jack");
		StringBuilder address3=new StringBuilder("234street 1 blbla");
		StringBuilder city3=new StringBuilder("Newyork");
		
		
		
		
		
		
	}

}
