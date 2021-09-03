package com.syntax.class13;

public class Methods2 {
	//if using written statements and data types can store 2 way/roundtrip ticket
	double getMax(double num1, double num2) {
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	//below cant store anything in void or return anything 1 way ticket
	void getMAxWithOutReturn (double num1, double num2) {
		
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}

}
}
