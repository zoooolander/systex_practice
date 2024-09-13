package com.systex.model;

import java.util.Comparator;

public class DayComparator implements Comparator<MyDate> {
	public int compare(MyDate myDate1, MyDate myDate2) {
		if (myDate1.getDay() > myDate2.getDay()) {
			return 1;
		} else if (myDate1.getDay() < myDate2.getDay()) {
			return -1;
		} else {
			return 0;
		}
	}
}
