package com.syntax.class14;

public class Method {
	
	int add(int num1, int num2) {
		
		return num1+num2;
		
	}
	int [] dobuleTheArray(int []arr) {
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=arr[i]*2;
		}
		return arr;
	}

}
