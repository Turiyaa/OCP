package com.ocp.hashcode;

public class Card {

	
	public String rank;
	public String suit;
	
	public Card(String r, String s) {
		if(r == null || s == null)
			throw new IllegalArgumentException();
		rank = r;
		suit = s;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		Card c = (Card) obj;
		
		return rank.equals(c.rank) && suit.equals(c.suit);
	}
	
	// It's common not to include boolean and char variable in hashCode
	// With in same program, hashCode() must not change. Avoid using variable in hashCode that changes its values.
	// If equals returns true, two objects hashCode must be same. 
	// Multiplying by prime number makes hashCode more unique
	@Override
	public int hashCode() {
		return rank.hashCode();
	}
	
	public static void main(String[] args) {
		Card c1 = new Card("A", "Spade");
		Card c2 = new Card("A", "Diamond");
		
		System.out.println(c1.equals(c2));
		
		// HashCode doens't have to be unique when two objects are not equal.
		System.out.println(c1.hashCode() == c2.hashCode());
	}
}
// hashCode() is expected to override when overriding equals() method
