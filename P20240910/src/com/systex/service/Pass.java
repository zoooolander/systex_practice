package com.systex.service;

import com.systex.model.MyDate;

public class Pass {
	public void changeIntValue(int value) {
		value = 100;
	}
	public void changeObjectReference(MyDate ref) {
		ref = new MyDate(25,12,2015);
	}
	
	public void changeOjectValue(MyDate ref) {
		ref.setDay(30);
		ref.setMonth(10);
	}
}
