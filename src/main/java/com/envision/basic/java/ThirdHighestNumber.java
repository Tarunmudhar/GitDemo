package com.envision.basic.java;

import java.util.Arrays;

public class ThirdHighestNumber {

	public static void main (String[] args) {
	int largestNo[] = {10,4,5,6,7,87,8,4};
	 
	int size = largestNo.length;
	
	Arrays.sort(largestNo);
	
	String sortedList = Arrays.toString(largestNo);
	
	System.out.println("Sorted list is"+sortedList );
	
	int  ThHighestNumber = largestNo [size-3];
	
	System.out.println("The third Highest Number is " + ThHighestNumber);
	
	
}
}
