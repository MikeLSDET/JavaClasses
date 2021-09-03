package com.syntax.class15;

public class SplitDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str= "This is Batch";
		String strArr[]=str.split("i");
		System.out.println(strArr.length);
		System.out.println(strArr[0]);//Th
		System.out.println(strArr[1]);//s
		System.out.println(strArr[2]);//s Batch
	}

}
