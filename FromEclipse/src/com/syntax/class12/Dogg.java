package com.syntax.class12;

public class Dogg {
	
	String breed;
	String gender;
	String color;
	String size;
	int age;
	
	void bark(){
		System.out.println(breed+" that is a "+gender+", color is "+color+", size is "+size+" for being "+age+" years old, is barking");
		
	}
	
	void waggingTail() {
		System.out.println(breed+" is wagging tail");
	}
	
	void poop() {
		System.out.println(breed+" is pooping");
	}
	
	void pant() {
		System.out.println(breed+" is panting");
	}
	
	void chase() {
		System.out.println(breed+" is chasing something");
	}
	

	public static void main(String[] args) {
		
		Dogg dog1=new Dogg();
		dog1.breed="Husky";
		dog1.gender="Male";
		dog1.color="white";
		dog1.size="large";
		dog1.age=6;
		dog1.bark();
		dog1.pant();
		dog1.chase();
		
		Dogg dog2=new Dogg();
		dog2.breed="Bulldog";
		dog2.gender="Female";
		dog2.color="brown/black";
		dog2.size="small";
		dog2.age=15;
		dog2.bark();
		dog2.waggingTail();
		dog2.poop();
		
		
		Dogg dog3=new Dogg();
		dog3.breed="Labrador";
		dog3.gender="Female";
		dog3.color="Tan";
		dog3.size="Average";
		dog3.age=1;
		dog3.bark();
		dog3.pant();
		dog3.chase();
		

	}

}
