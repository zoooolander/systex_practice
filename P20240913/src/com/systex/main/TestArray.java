package com.systex.main;

import java.util.Arrays;

import com.systex.util.MyMath;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits = new String[] { "apple", "banana", "melon" };
		int[] grades;
		grades = new int[] { 15, 60, 22, 88 };
		System.out.println(Arrays.toString(fruits));
		System.out.println(Arrays.toString(grades));
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		String[] newFruits = new String[10];
		// System.arraycopy(newFruits, 0, grades, 0, fruits.length);//
		// (來源陣列，來源陣列起始索引，目標陣列，目標陣列起始索引，複製長度)
		System.out.println(Arrays.toString(newFruits));

		System.out.println("method 1=========================");
		int[][] numbers = { { 1, 2, 3 }, { 11, 22 }, { 111, 222, 333, 444 } };
		System.out.println(Arrays.deepToString(numbers));

		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				sum += numbers[i][j];
			}
			double avg = sum / numbers[i].length;
			sum = 0;
			System.out.println(avg);
		}
		System.out.println("method 2=========================");
		for (int[] num : numbers) {
			for (int n : num) {
				sum += n;
			}
			double avg = sum / num.length;
			sum = 0;
			System.out.println(avg);
		}
		System.out.println("======================");
		System.out.println(MyMath.average(1, 3.3, 5.5, 7, 9));
	}

}
