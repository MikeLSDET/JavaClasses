package com.syntax.class10;

public class TwoDArrays {

	public static void main(String[] args) {
		
		int a;
		int[] b=new int[3];
		
		//creating a 2D Array
		int[] [] c= new int [3][4];
		//1 row or first array
		c[0] [0]=11;
		c[0][1]=12;
		c[0][2]=13;
		c[0][3]=14;
		
		//2 row or 2nd array
		c[1][0]=20;
		c[1][1]=30;
		c[1][2]=40;
		c[1][3]=50;
		
		//3 row or 3rd array
		
		c[2][0]=100;
		c[2][1]=200;
		c[2][2]=300;
		c[2][3]=400;
		
		System.out.println(c[1][3]);//50 to access specify from which row index and column index
		System.out.println(c[2][1]);//200 another way to think of it-- to access specify from which array and from what element index you want
		
		
		System.out.println("----ANOTHER WAY OF CREATING A 2D ARRAY----");
		
		
		int [][] myArray= {
				     {11,12,13,14,15},//1st array , index 0
				     {20,30,40,},//2nd array index 1
				     {100,200,300,400,}//3rd array index 2
				                    };
		
		System.out.println(myArray[0][4]);//15
		System.out.println(myArray[1][0]);//20
	
			
		
	}

}
