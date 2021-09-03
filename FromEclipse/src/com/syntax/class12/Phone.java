package com.syntax.class12;

public class Phone {
	
	String make;
	String model;
	String color;
	int year;
	
	
	void call(){
		System.out.println(make+model+" is calling someone");
	}
	
	void facetime() {
		System.out.println(make+model+" is facetiming someone");
	}
	
	void vibrate() {
		System.out.println(make+model+" is vibrating");
	}
	
	void endPrevious() {
		System.out.println(make+model+" ended previous action");
	}
	

	public static void main(String[] args) {
		
		
		Phone phone1=new Phone();
		phone1.make="Iphone";
		phone1.model=" X";
		phone1.color="Galaxy Black";
		phone1.call();
		phone1.endPrevious();
		phone1.vibrate();
		phone1.facetime();
		
		
		Phone phone2=new Phone();
		phone2.make="Samsung";
		phone2.model=" Galaxy Z Flip";
		phone2.color="Lavender";
		phone2.vibrate();
		phone2.call();
		
		Phone phone3=new Phone();
		
		phone3.make="Nokia";
		phone3.model=" G10";
		phone3.color="Brown";
		phone3.facetime();
		phone3.endPrevious();
		
		
		
		
		
		
		

	}

}
