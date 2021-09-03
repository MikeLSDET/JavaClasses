package com.syntax.reviewclass02;

public class ShortHandOperatorDemo2 {

	public static void main(String[] args) {
		int number=10;
		number*=number+10;// java reads the numbers after the equals sign first so (number+10=20) then the shorthand so 10*20=200
		System.out.println(number);

	}

}
