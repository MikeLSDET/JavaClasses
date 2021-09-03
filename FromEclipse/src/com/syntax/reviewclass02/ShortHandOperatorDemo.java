package com.syntax.reviewclass02;

public class ShortHandOperatorDemo {

	public static void main(String[] args) {
		
		
		int number=10;//storing 10 inside box
		number+=20;//there is a box called number and add 20=30
		System.out.println(number);//new value for number is 30
		number+=20+30;//30+20+30=80
		
		System.out.println(number);//number equals 80
		number+=number+50;//80+80+50
		System.out.println(number);//number equals 210
	}

}
