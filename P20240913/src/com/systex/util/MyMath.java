package com.systex.util;

public class MyMath {

	public static double average(double... numbers) {// 可以傳 double 的相容型別
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

}
