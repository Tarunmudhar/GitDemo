package com.envision.basic.java;

import java.util.HashMap;
import java.util.Random;

public class RandomHashMapEx {
	
	public static void main (String [] args) {
		
		Random numbers = new Random();
		
		int no = numbers.nextInt(50);
		int age = numbers.nextInt(50);
		
		HashMap diffage = new HashMap();
		
	 diffage.put(no, age);
	 
	 diffage.clear();
	 
	 System.out.println("Random key and Random value : " + diffage);
		
		
		
	}

}
