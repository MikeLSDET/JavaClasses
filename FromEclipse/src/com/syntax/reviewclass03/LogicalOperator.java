package com.syntax.reviewclass03;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//Logical operators in Java are && || !
		
		/*
		 * we can use these operators to put multiple conditions in if blocks
		 * 
		 * 
		 */
		
		String day="Monday";
		//day.equals("Sunday")
		
		if("Sunday".equals(day)) {
			System.out.println("its weekend");
			
		}else if (day.equals("Saturday")) {
			System.out.println("its weekend");
		}else {
			System.out.println("its weekday");
		}
		
		
		if(day.equals("Sunday") || day.equals("Saturday")) {
			System.out.println("its weekend");
			
		} else {
			System.out.println("its weekday");
		}
		
		if(day.equals("Sunday") || day.equals("Saturday"))//without curly brackets it will only hold one condition
			System.out.println("its weekend");//will be the one condition since no curly brackets
		    System.out.println("its weekend");//will print since it does not belong to a condition since no curly brackets
		    System.out.println("its weekend");//same reason as 2nd one--will print since it does not belong to a condition since no curly brackets
			
			
	}

}
