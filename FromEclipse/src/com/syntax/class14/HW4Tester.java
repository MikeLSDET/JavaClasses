package com.syntax.class14;

public class HW4Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HW4 item=new HW4();
		String result=item.reverse("Sunday");
		
		System.out.println(result.substring(5)+result.charAt(4)+""+result.charAt(3)+""+result.charAt(2)+""+result.charAt(1)+""+result.charAt(0));
		
		

	}

}
