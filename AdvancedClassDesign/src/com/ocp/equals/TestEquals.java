package com.ocp.equals;

public class TestEquals {
	public static void main(String[] args) {
		String s1 = new String ("lion");
		String s2 = new String ("lion");
		
		// String have equals method and it checks if the values are equal
		System.out.println(s1.equals(s2)); // true
		
		
		//String builder implements equals provided by object so it doens't 
		// check if the values are equal 
		// It checks if two objects being referred to are the same.
		StringBuilder sb1 = new StringBuilder("lion");
		StringBuilder sb2 = new StringBuilder("lion");
		System.out.println(sb1.equals(sb2)); // false
		
		// Returns true since sb1 and sb3 are same object
		StringBuilder sb3 = sb1;
		System.out.println(sb1.equals(sb3)); // true
		
		// Returns true since sb1 and sb3 refers to same object
		System.out.println(sb1 == sb3);      // true


	}
}
