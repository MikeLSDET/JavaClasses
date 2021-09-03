package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {
		
		
		String[] name=new String[5];
		name[0]="Michael";
		name[1]="Mauricio";
		name[2]="Javier";
		name[3]="Chris";
		name[4]="Nicolas";
		int size=name.length;
		System.out.println("# of elements in array name ="+size);//length is only used with array values
		
		System.out.println(name[0]);
		
		
		
		
		//declaration and storing values must be completed right away
		String[] names= {"Michael", "Mauricio", "Javier", "Chris", "Nicolas"};
		System.out.println(names[3]);
		
		names[3]="Alien";
		System.out.println(names[3]);
		
		int[]num;
		num=new int[2];
		num[0]=1;
		num[1]=10;
		
		
		int[] n;
		//n= {10, 20}; not possible to add values this way after declaration
		
		int[] array= {10, 20, 30, 40, 50};
		
		

	}

}
