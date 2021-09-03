package com.syntax.class09;

public class Clock24Hours {

	public static void main(String[] args) {

		for (int h = 0; h <= 23; ++h) {

			for (int m = 0; m <= 59; ++m) {
				if (h < 10 && m < 10) {
					System.out.println("0" + h + ":0" + m);

				} else if (h < 10 && m >= 10) {
					System.out.println("0" + h + ":" + m);
				} else if (h >= 10 && m < 10) {
					System.out.println(h + ":0" + m);
				} else {
					System.out.println(h + ":" + m);
				}

			}
		}
		
		
		
		
		System.out.println(" ------------------WHAT IS THE OUTPUT----------");
		
		
		for (int i =0; i<=3; i++) {
			System.out.println("Outer Loop "+i);
		
			for (int j=0; j<3; j++) {
				System.out.println("Inner Loop "+j);
				break;
		}
	}
		
		System.out.println(" ------------------WHAT IS THE OUTPUT----------");
		
		boolean boo=true;
		
		for (int i=1; i<3; i++) {
			
			System.out.println("Outer for loop");
			
			while(boo) {
				System.out.println("I am nested while loop");
				break;
			}
			
			
		}
		
		
		
}
}
