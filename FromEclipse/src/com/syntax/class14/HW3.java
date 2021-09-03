package com.syntax.class14;

public class HW3 {
	/*
	 * Create a String and if the String is not empty perform the following: 
if the String has an odd number of characters and has 3 or more characters, 
print the character in the middle of the String.
	 */

	
	String method(String word){
		if(word.isEmpty()) {
			return "Invalid";
		}else if (word.length()>=3 && word.length()%2!=0) {
			return word.substring(2,3);
			
		}else {
			return "Invalid";
		}
	}

	
}

