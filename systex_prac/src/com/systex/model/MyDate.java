package com.systex.model;

public class MyDate implements Comparable<MyDate> {
	private int day;
	private int month;
	private int year;

	public MyDate() {
		// super();
	}

	public MyDate(int day, int month, int year) {
		// super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public int compareTo(MyDate myDate) {
		// 1. 比較年份
		if (this.year > myDate.year) {
			return 1;
		} else if (this.year < myDate.year) {
			return -1;
		} else {
			// 2. 如果年份相同，則比較月份
			if (this.month > myDate.month) {
				return 1;
			} else if (this.month < myDate.month) {
				return -1;
			} else {
				// 3. 如果月份也相同，則比較日期
				if (this.day > myDate.day) {
					return 1;
				} else if (this.day < myDate.day) {
					return -1;
				} else {
					// 年、月、日都相同
					return 0;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
