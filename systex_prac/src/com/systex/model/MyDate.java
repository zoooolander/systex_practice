package com.systex.model;

import java.util.Comparator;

public class MyDate implements Comparable<MyDate> {
	private int year;
	private int month;
	private int day;

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
	
	// 靜態 Comparator 用於由新至舊排序
    public static final Comparator<MyDate> NEW_TO_OLD_COMPARATOR = new Comparator<MyDate>() {
        @Override
        public int compare(MyDate date1, MyDate date2) {
            // 使用 compareTo 方法，反轉比較結果
            return date2.compareTo(date1);
        }
    };

	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
}
