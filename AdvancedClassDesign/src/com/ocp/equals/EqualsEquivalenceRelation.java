package com.ocp.equals;

public class EqualsEquivalenceRelation {
	public static void main(String[] args) {
		
		
		Lion x = new Lion(1, 12, "Simba");
		
		//Reflaxive x.equals(x)
		System.out.println(x.equals(x)); //true
		
		Lion y = new Lion(1, 10, "Simba");
		
		// Symmetric
		System.out.println(x.equals(y)); // true
		System.out.println(y.equals(x)); // true
		
		// Transitive
		Lion z = new Lion(1, 12, "Blah");
		
		System.out.println(x.equals(y)); // true
		System.out.println(y.equals(z)); // true
		System.out.println(x.equals(z)); // true
		
		System.out.println(x.equals(null)); // false
		}

}
