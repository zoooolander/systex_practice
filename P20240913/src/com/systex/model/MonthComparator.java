package com.systex.model;

import java.util.Comparator;

public class MonthComparator implements Comparator<MyDate> {
	public int compare(MyDate myDate1, MyDate myDate2) {
		if (myDate1.getMonth() > myDate2.getMonth()) {
			return 1;
		} else if (myDate1.getMonth() < myDate2.getMonth()) {
			return -1;
		} else {
			return 0;
		}
	}
}
