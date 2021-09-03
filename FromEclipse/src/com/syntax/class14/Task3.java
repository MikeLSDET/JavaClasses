package com.syntax.class14;

public class Task3 {
// Create a method createEmail(). Based on values of users name, lastName and email type,
	//your method should return complete email address. example: createEmail(john, snow, gmail) ->
	//johnsnow@gmail.com
	
	
	String createEmail(String firstName, String lastName, String emailType) {
		
		return firstName+lastName+"@"+emailType+".com";
	}
}
