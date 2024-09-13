package com.systex.main;

import java.util.Collections;
import java.util.LinkedList;

import com.systex.model.DayComparator;
import com.systex.model.MonthComparator;
import com.systex.model.MyDate;

public class TestSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<MyDate> dates = new LinkedList<>();
		dates.add(new MyDate(22, 11, 2024));
		dates.add(new MyDate(25, 10, 2000));
		dates.add(new MyDate(3, 2, 1987));
		dates.add(new MyDate(29, 2, 1992));
		dates.add(new MyDate(8, 6, 2012));
		dates.add(new MyDate(17, 8, 1995));
		dates.add(new MyDate(1, 1, 1989));

		System.out.println("not yet sorted");
		dates.forEach(d -> System.out.println(d));
		System.out.println("sotrted by year");
		Collections.sort(dates);
		dates.forEach(d -> System.out.println(d));
		System.out.println("sotrted by month");
		Collections.sort(dates, new MonthComparator());
		dates.forEach(d -> System.out.println(d));
		System.out.println("sotrted by day");
		Collections.sort(dates, new DayComparator().reversed());
		dates.forEach(d -> System.out.println(d));
	}

}
