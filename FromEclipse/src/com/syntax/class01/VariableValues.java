package com.syntax.class01;

public class VariableValues {

	public static void main(String[] args) {
		
		int myNumber=100;
		
		char myGender='M';
		
		int  age=22;
		
		//boolean myNumber = true; --. error saying duplicate variable
		System.out.println(myNumber); 
		System.out.println(age);//this one will be 22 since above
		
		
		age=23;// system below will read 23 now since you added this,<--
		
		System.out.println(age);//23
		
		char letter = 'A';
		letter ='B';// to reassign do not use write the variable (char) do this,<-- you can reassign infinite amount of times
		
		System.out.println(letter);
	}

}
