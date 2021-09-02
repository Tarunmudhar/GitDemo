package com.envision.basic.java;

public class reverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {2,4,6,8,9,0};
		
		System.out.println("Original");
		
		for (int i = 0; i <a.length;i++) {
			
			System.out.print(a[i]+" ");
		}
		
		System.out.println(" ");
		System.out.println("Reversed");
		
		for (int i=a.length-1; i >=0;i--) {
			
			System.out.print(a[i]+" ");
			
		}
	}

}
