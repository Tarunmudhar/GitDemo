package com.envision.basic.java;

import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {
		
		String s1 = "silent";
		String s2 = "listen";
		
		System.out.println("Both strings are anagram "+ifAnagram(s1,s2));
		
		
	}
	public static boolean ifAnagram(String s1, String s2) {
		
		char [] str = s1.toCharArray();
		char [] str1 = s2.toCharArray();
		
		Arrays.sort(str);
		Arrays.sort(str1);
		
		return Arrays.equals(str, str1);
	}

}
