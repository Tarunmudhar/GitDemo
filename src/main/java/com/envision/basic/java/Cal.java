package com.envision.basic.java;

class Calculator {
	
	int result;
	
	void PrintValues()
	{
		int x = 3 ;// global variables, instance variables, object variables
		int y = 9 ;
		
		String name = "tarun";
		char MaleOrFemale = 'M';
		boolean ifTrue = false;
		long longValue = 688898;
		double dblValue = 9.8;
		
		System.out.println(" First number : "+ x);
		
		System.out.println(" name is : "+ name);
		System.out.println(" male or female : "+ MaleOrFemale);
		System.out.println(" true or false :"+ ifTrue);
		System.out.println(" double valee : "+ dblValue);
		System.out.println(" long valee :"+ longValue);
		
		
	}
	void addition() {
		
		result = x+y;
		System.out.println(" Addition of numbers is "+ result);
		
	}
	
	void subtraction() {
		
		result = x-y;
		System.out.println(" Subtraction of numbers is :"+ result);
	}
	
	void multiplication() {
		
		result = x*y;
		System.out.println(" Multiplication of numbers is "+ result);
		
	}
	void divide() {
		
		result = x/y;
		System.out.println(" Division of numbers is "+ result);
		
	}
	
	}

public class Cal{
	
	public static void main (String[] args) {
		
		Calculator obj = new Calculator();
		obj.PrintValues();
		//obj.addition();
		
		
		//obj.subtraction();
		
		
		//obj.multiplication();
		
		
		//obj.divide();
	}
	}

