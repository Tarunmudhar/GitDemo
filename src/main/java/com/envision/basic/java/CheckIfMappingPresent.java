package com.envision.basic.java;

import java.util.HashMap;

public class CheckIfMappingPresent {
	
	public static void main (String [] args) {
		
		HashMap <String, Integer> intro = new HashMap ();
		
		intro.put("Ram", 21);
		intro.put("Har", 31);
		intro.put("karan", 41);
		intro.put("Raman", 30);
		
		if (intro.containsKey("Har")) {
			
			System.out.println("YES:" + intro.get("Har"));
			
		}
	
	}

}
