package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		
		double[] d=new double[4];//you declared 4 so you can't add 5 unless changed here to 5, in other words arrays are fixed in size
		//during execution, when java runs code--> it cannot increase the size
		d[1]=10.99;
		d[2]=12.99;
		d[3]=10;
		//day[4]=1.99; will give you an error (ArrayIndexOutOfBounds)
		
		
		System.out.println(d[0]);
		
		int[] numbers=new int[2];
		numbers[0]=100;
		numbers[1]=200;
		
		System.out.println(numbers[1]);
		
		int num;//declare a variable
		int arrayVar[];//declare an array
		int[]arr;
		
		num=10;
		
		arr=new int[3];//extra boxes since you only have one official element below
		arr[0]=10;
		
		System.out.println(arr[1]);//defaults to default value of int which is 0.
	}

}
