package com.envision.basic.java;
import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		String name = ("taruuunnn");
		RemoveDuplicates(name);
	}

	public static void RemoveDuplicates(String name) {
		
		// We will store the characters in the LinkedHashMap
		
		LinkedHashSet<Character> map = new LinkedHashSet<Character>();
		
		
		for (int i =0; i<name.length(); i++) {
		
		map.add(name.charAt(i));
		}
		
		for(Character ch : map) {
			System.out.print(ch);
		
		}
		
	}
}
