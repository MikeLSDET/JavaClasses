package com.syntax.class14;

public class MethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,10,10,10};
		
		Method method=new Method();
		
		arr=method.dobuleTheArray(arr);
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
