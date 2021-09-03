package com.syntax.class15;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
		String sentence="This is a sentence.";
		
		String sentence2=sentence.replaceAll(" ", "");
		
		System.out.println(sentence2);
		
		
		
		
		
		
		
		//Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String.
		String combo="!Asdnsmfjkndfkdjsfnkjds123343iu9fu98uf83kjrnfsiosDFSDFDFD**!";
		int howManyAlpha=combo.replaceAll("[^0-9A-Za-z]","").length();
		System.out.println(howManyAlpha);
		
		
		// You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?
		String a="Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?";
		
		String[] arr=a.split("[?]");
		System.out.println(arr.length);
		
		//How would you reverse a String character by character?
		String forward="Jupiter";
		
		StringBuilder convert=new StringBuilder(forward);
		convert.reverse();
		
		forward=convert.toString();
		System.out.println(forward);
		
		
		//How would you reverse a String word by word?
		
		String sentenceForward=" Hello this is a sentence";
		
		StringBuilder convert2=new StringBuilder(sentenceForward);
		convert2.reverse();
		
		sentenceForward=convert2.toString();
		System.out.println(sentenceForward);
		
		//How would you check if String is palindrome or not?
		
		String palindrome="eye";
		
		StringBuilder backwards=new StringBuilder(palindrome);
		backwards.reverse();
		
		
		String wordReverse=backwards.toString();
		
		if(palindrome.equals(wordReverse)) {
			System.out.println("This is a palindrome");
			
		}else {
			System.out.println("This is not a palindrome");
		}
		
		//How would you swap  2 strings without a temporary variable?
		
		String word1="Yes";
		
		String word2="No";
		
		word1=word1+word2;
		
		
		
		
	word2=word1.substring(0,word1.length()-word2.length());
	System.out.println(word2);
	
	
	word1=word1.substring(word2.length());
	System.out.println(word1);
	
		
		
		
		
		
		}
	}
	
	
	
	



