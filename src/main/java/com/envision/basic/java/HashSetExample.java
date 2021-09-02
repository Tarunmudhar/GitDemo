package com.envision.basic.java;
import java.util.HashSet;

public class HashSetExample {
	
	public static void main(String[]args) {
	HashSet <String> fruits = new HashSet <String> ();
	
	fruits.add("apple");
	fruits.add("banana");
	fruits.add("orange");
	fruits.add("grape");
	fruits.add("strawberry");
	fruits.add("blueberry");
	fruits.add("kiwi");
	
	//fruits.clear();
	
	for (String i : fruits)
	{
		System.out.println(i);
	}
}
}