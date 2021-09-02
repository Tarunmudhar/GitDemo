package com.envision.basic.java;// package details, everything written in red are keywords

public class Dog {
	
	String breed = "labragssh";
	int tail = 1;
	String color ="black";//string is a class not a data type
	int ears = 2;
	int eyes = 2;
	int nose = 1;
	char breedsize = 'M';

	int legs = 4;
	
	
	void displayLegs() {
		
		System.out.println("no of legs of dpg are : " +legs);
		
		
	}
	
	    public static void main(String[] args) {
			
			// reference variable  
			Dog obj = new Dog();// creates the dog object 
			obj.displayLegs();
		}
}


	
	
	
