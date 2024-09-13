package com.systex.model;

import java.util.Comparator;
import java.util.Objects;

public class MyDate implements Comparable<MyDate> {
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	private int day;
	private int month;
	private int year;

	public static final Comparator<MyDate> MONTH_COMP = new Comparator<MyDate>() {
		public int compare(MyDate myDate1, MyDate myDate2) {
			if (myDate1.getMonth() > myDate2.getMonth()) {
				return 1;
			} else if (myDate1.getMonth() > myDate2.getMonth()) {
				return -1;
			} else {
				return 0;
			}
		}
	};

	public static final Comparator<MyDate> DAY_COMP = new Comparator<MyDate>() {
		public int compare(MyDate myDate1, MyDate myDate2) {
			if (myDate1.getDay() > myDate2.getDay()) {
				return 1;
			} else if (myDate1.getDay() > myDate2.getDay()) {
				return -1;
			} else {
				return 0;
			}
		}
	};

	public MyDate(int day, int month, int year) {
		// super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public MyDate() {
		// super();
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	@Override
	public int compareTo(MyDate myDate) {
		if (this.year > myDate.year) {
			return 1;
		} else if (this.year < myDate.year) {
			return -1;
		} else {
			return 0;
		}
	}
}
