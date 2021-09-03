package com.syntax.class13;

public class UserInfo {

	//Create a method createEmail(). 
	//Based on values of users name, lastName and email type, your method should return complete email Address. 
	//Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
	
	void createEmail(String name, String lastName, String emailType) {
		System.out.println( name+lastName+"@"+emailType+".com");
		
	}
}
