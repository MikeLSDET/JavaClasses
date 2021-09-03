package com.syntax.class04;

import java.util.Scanner;

public class PracticingScanner {
	public static void main (String []args) {
		
	Scanner data=new Scanner (System.in);
	
	System.out.println("What would you like to watch?");
	String name=data.nextLine();
	System.out.println("What genre?");
	String name2=data.nextLine();
	System.out.println("Nice! Now how long would you like to watch it?");
	String name3=data.nextLine();
	System.out.println("Cool, so you would like to watch "+name+" and the genre you want is "+name2+" and you want to watch it for "+name3+" !");
	
		
		
	}

}
