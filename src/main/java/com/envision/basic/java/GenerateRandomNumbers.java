package com.envision.basic.java;
import java.util.Random;

public class GenerateRandomNumbers {
	public static void main(String[]args) {
		
		
		Random numbers = new Random();
		
		int x = numbers.nextInt();
		
		System.out.println(x);
	}
	}

