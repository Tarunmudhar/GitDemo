package com.envision.basic.java;

public class StringWordFound {
	
	public static void main (String [] args) {
		
		
		String name = "My name is Tarunpreet";
		
		int wordFind = name.indexOf("Tarunpreet");
		
		if (wordFind == -1) {
			
			System.out.println("word is missing");
		}
		
		else {
			
			
			System.out.println("Index of the word found is :" + wordFind);
			
		}
			
			
	}

}
