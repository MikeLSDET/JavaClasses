package com.syntax.reviewclass06;

public class MethodsQuery {
	
	double getMaximumValue(double v1, double v2) {
		if(v1>v2) {
			return v1;
		}else {
			return v2;
		}
	}
	
	void getMaximumValueWithoutAnyReuturn(double v1, double v2) {
		if(v1>v2) {
			System.out.println(v1);
		}else {
			System.out.println(v2);
		}
	}

}
