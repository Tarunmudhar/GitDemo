package com.envision.basic.java;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String ReverseString = "Lockdown is imposed in Toronto and Peel Region From Monday";
		
		String a[] = ReverseString.split(" ");
		
		for (int i=0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
		}
		
		System.out.println( " ");
		for (int i = a.length-1; i>=0;i-- ) {
			
			System.out.print(a[i] + " ");
		}		}
		
		}
