package com.envision.basic.java;

import java.util.HashMap;

public class HashMapExample {
	
	public static void main (String[] args) {
		
		HashMap <String, String> countries = new HashMap <String, String>();
			
		countries.put("England", "London");
		countries.put("India", "Delhi");
		countries.put("Canada", "Ottawa");
		countries.put("USA", "Washington");
		
		// accessing the key values we usekeyset
		for (String i : countries.keySet()) {
			
			System.out.println(i);
		}
		
		// accessing the values
		
		for (String i : countries.values()) {
			
			System.out.println(i);
		}
		
		for (String i : countries.keySet()) {
			System.out.println("key : " + i +  " value :" + countries.get(i));
		}
		}
			
		
	}

