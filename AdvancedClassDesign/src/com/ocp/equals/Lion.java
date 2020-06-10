package com.ocp.equals;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Lion {
	private int idNumber;
	private int age;
	private String name;

	public Lion(int idNumber, int age, String name) {
		this.idNumber = idNumber;
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Lion))
			return false;

		Lion otherLion = (Lion) obj;
		return this.idNumber == otherLion.idNumber;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	public static void main(String[] args) {
		Lion l1 = new Lion(1, 10, "Simba");
		System.out.println(l1);
	}
}
