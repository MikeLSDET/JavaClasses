package com.syntax.class03;

public class TemperatureCheck {
	public static void main (String[] args) {
		
		double hot=100.0;
		double cold=32;
		
		if (hot>cold) {
			System.out.println("Water will freeze with temperature "+cold);
		} else {
			System.out.println("Water will NOT freeze with temperature "+hot);
		}
		
	}

}
