package com.syntax.reviewclass06;

public class MethodsQueryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsQuery query=new MethodsQuery ();
		
		double result= query.getMaximumValue(10, 5);
		System.out.println(result);
		
		query.getMaximumValueWithoutAnyReuturn(10, 5);

	}

}
