package com.ocp.tostring;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Hippo {
private String name;
private double weight;

public Hippo(String name, int weight) {
	this.name = name;
	this.weight = weight;
}

// ToStringBuilder takes care of writing hefty toString methods
@Override
public String toString() {
	   return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	//return "Name: "+ name + ", Weight: " + weight; // Name: Biggy, Weight: 5000.0

}
/*
public String toString() {
return name;	// Biggy
}
*/

 public static void main(String[] args) {
	Hippo h1 = new Hippo("Biggy", 5000);
	System.out.println(h1); // Biggy
}

}
