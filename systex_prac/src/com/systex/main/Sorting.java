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

		System.out.println("原始資料尚未排序");
		dateList.forEach(d -> System.out.println(d));
		System.out.println();
		
		// 日期由舊至新排序
		System.out.println("日期由舊至新排序");
		Collections.sort(dateList);
		for (MyDate date : dateList) {
            System.out.println(date);
        }
		System.out.println();
		
		// 日期由新至舊排序
        System.out.println("日期由新至舊排序");
        Collections.sort(dateList, MyDate.NEW_TO_OLD_COMPARATOR);
        for (MyDate date : dateList) {
            System.out.println(date);
        }
	}

}
