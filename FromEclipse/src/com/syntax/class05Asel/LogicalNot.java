package com.syntax.class05Asel;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean b=!true;//equals false
		
		boolean a=!false;  // not operator negate the original boolean value so this equals true
		
		System.out.println(b);
		System.out.println(a);
		
				
		boolean hungry=true;
		
		if(!hungry) {
			System.out.println(" i am not hungry");
		
		}	
		System.out.println("--------------------------------------");
		boolean hot=false;
		
		if(!hot) {
			System.out.println(" I will go for a walk");
		}
		System.out.println("End of the code");
		
		String name="hamza";
		
		if(!name.equals("Stephanie")) {
			System.out.println("Then I am not looking for you");
		}
	
	
	}

}
