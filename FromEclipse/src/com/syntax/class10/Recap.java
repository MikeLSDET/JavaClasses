package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		
		
		
		
		String[] array=new String[3];
		
		array[0]="Hello";
	    array[1]="Hi";
	   
	    System.out.println(array[2]);
	    
	    //default values double=0.0, int=0, String=null, boolean=false
	    
	    //System.out.print(array[3];--> ArrayIndexOutOfBoundsException: 3
	    
	    int size=array.length;
	    System.out.println(size);
	    
	    array[2]="How are you?";
	    System.out.println("---------------------");
	    
	    System.out.println(array[2]);//How are you?
	    
	    for(int i=0; i<array.length; i++) {
	    	
	    	System.out.println(array[i]+";");
	    	
	    }
	    System.out.println("-----------");
	    
	    for(String arr:array) {
	    	System.out.println(arr+"; ");
	    }
	    
	    
	    
	}

}
