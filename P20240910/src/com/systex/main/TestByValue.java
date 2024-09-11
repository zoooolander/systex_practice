package com.systex.main;

import com.systex.model.MyDate;

public class TestByValue {
	public static void main(String[] args) {
		int a = 100;
		int b = a;
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		b = 200;
		System.out.println("a= " + a);
		System.out.println("b= " + b);

		MyDate d1 = new MyDate(10, 9, 2024);
		MyDate d2 = d1;
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		
		d2.setDay(25);
		d1.setMonth(10);
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		
		d2 = new MyDate(30, 10, 2024);
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
	}
}
