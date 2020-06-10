package com.ocp.tostring;

import java.util.ArrayList;

public class TestToString {
public static void main(String[] args) {
	
	//Prints empty array [], since super class of ArrayList provides toString
	//implementation
	System.out.println(new ArrayList<>());
	
	// Prints Object, Array uses the default Object toString method
	System.out.println(new String[0]);
}
}
