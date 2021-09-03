package com.syntax.class05Asel;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		

		
		
		
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F

		 * 
		 * 
		 */
		
		Scanner data=new Scanner (System.in);
		
		int quiz,midTerm,finalScores,averageScore;
		
		
		System.out.println("Please enter your quiz score, mid term score and final score.");
		quiz=data.nextInt();
		midTerm=data.nextInt();
		finalScores=data.nextInt();
		averageScore=((quiz+midTerm+finalScores)/3);
		
		
		if (averageScore>=90) {
			System.out.println("grade a");
		}else if (averageScore>=70 && averageScore<90) {
			System.out.println("grade b");
		}else if (averageScore>=50 && averageScore<70) {
			System.out.println("grade=c");
		}else if(averageScore<50) {
			System.out.println("grade=f");
		}
		
	
		
		
		
		
	}

}
