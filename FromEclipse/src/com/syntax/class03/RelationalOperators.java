package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		// relation operators and equality operators always result in boolean  types of value (<,<=,>,>=,!=,==)
		int num=10;
		int num1=20;
		
		System.out.println(num>num1);// is 10 greater than 20 output= false
		System.out.println(num!=num1);//10 is not (!=) equal to 20 output=true
		System.out.println(num<num1);//is 10 less than 20 output =true
		System.out.println(num==num1);// is 10 equal to 20 output false
		
		
		
		int a=100;
		int b=190;
		
		boolean boo=a<b;//result of relational operators ALWAYS a boolean value (true or false)
		System.out.println(boo);
		
		
		System.out.println(a==b);//checking if a equals(==) b thats why output is false
		System.out.println(a=b);//reassigning(=) value of b to a
		
		System.out.println(a<b);//false because they are now equal due to reassigning above on line 25
		
		
		
		
		
		
		
		

	}

}
