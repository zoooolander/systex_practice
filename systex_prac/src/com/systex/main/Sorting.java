package com.systex.main;

import java.util.Collections;
import java.util.LinkedList;

import com.systex.model.MyDate;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<MyDate> dateList = new LinkedList<>();
		dateList.add(new MyDate(22, 11, 2024));
		dateList.add(new MyDate(25, 10, 2000));
		dateList.add(new MyDate(3, 2, 1987));
		dateList.add(new MyDate(29, 2, 1987));
		dateList.add(new MyDate(8, 6, 2012));
		dateList.add(new MyDate(17, 8, 1995));
		dateList.add(new MyDate(1, 1, 1989));

		System.out.println("Not yet sorted");
		System.out.println();
		dateList.forEach(d -> System.out.println(d));
		Collections.sort(dateList);
        // print排序後的結果
		System.out.println("sorted");
        for (MyDate date : dateList) {
            System.out.println(date);
        }
	}

}
