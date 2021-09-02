package com.envision.basic.java;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int input1 = input.nextInt();
		
		if (input1%2==0) {
			
			System.out.println(input1 + "is a even number");
		}
		else
		{
			System.out.println(input1 + "is a odd number");
		}
		
		

	}

}
