package com.systex.hr.model;

public enum ESeason {
	Spring("春"), Summer("夏"), Fall("秋"), Winter("冬");

	private final String name;

	private ESeason(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
