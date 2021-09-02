package com.envision.basic.java;

import java.util.ArrayList;

public class ArrayIteration {
	
	public static void main (String[] args) {
		
		ArrayList age = new ArrayList();
		
		age.add(20);
		age.add(10);
		age.add(30);
		age.add(50);
		age.add(2);
		age.add(70);
		age.add(50);
		
	System.out.println(age);
		
	for(int i =0; i< age.size();i++) {
		
		System.out.println(age.get(i));
	}
		
	}
	}


